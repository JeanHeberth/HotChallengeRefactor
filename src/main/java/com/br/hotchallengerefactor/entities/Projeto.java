package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Builder
public class Projeto extends GenericDomain {


    private String nome;

    private Double valorProjeto;

    private Date dataInicio;
    private Date dataFinal;

    @ManyToOne()
   Departamento departamento;


    public void custoProjeto(Funcionario funcionario) {
        valorProjeto = valorProjeto + funcionario.getSalario();
    }


}
