package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Departamento extends GenericDomain {


    @Column(nullable = false, length = 45)
    private String nome;


    @Column(nullable = false, length = 50)
    private Long numero;

    @OneToMany(mappedBy = "departamento")
    private List<Projeto> projetos;

    @ManyToOne
    private Orcamento orcamento;

    public void adicionarProjeto(Projeto projeto) {
        getProjetos().add(projeto);
        projeto.setDepartamento(this);
    }

    public List<Projeto> getProjetos() {
        if (projetos == null) {
            projetos = new ArrayList<>();
        }
        return projetos;
    }

}
