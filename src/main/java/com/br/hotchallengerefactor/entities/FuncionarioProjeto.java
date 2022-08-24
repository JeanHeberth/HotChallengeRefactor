package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class FuncionarioProjeto extends GenericDomain {


    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Projeto projeto;
}