package com.br.hotchallengerefactor.entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Funcionario extends GenericDomain {


    @NotNull
    private String nome;

    @NotNull
    private String cpf;

    @NotNull
    private Date dataNascimento;

    @NotNull
    private char sexo;

    @NotNull
    private Double salario;

    @ManyToOne
    private Funcionario supervisor;


    @OneToOne
    @NotNull
    private Endereco endereco;

    @OneToMany(mappedBy = "supervisor")
    private List<Funcionario> subordinados;


    public void adicionarSubordinados(Funcionario funcionario) {
        getSubordinados().add(funcionario);
        funcionario.setSupervisor(this);
    }

    public List<Funcionario> getSubordinados() {
        if (subordinados == null) {
            subordinados = new ArrayList<>();
        }
        return subordinados;
    }

}
