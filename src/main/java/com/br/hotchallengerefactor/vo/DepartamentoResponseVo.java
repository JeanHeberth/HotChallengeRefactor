package com.br.hotchallengerefactor.vo;


import com.br.hotchallengerefactor.entities.Departamento;
import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartamentoResponseVo {

    private Long id;
    private String nome;
    private Long numero;


    public DepartamentoResponseVo(Departamento departamento) {
        this.id = departamento.getId();
        this.nome = departamento.getNome();
        this.numero = departamento.getNumero();
    }
}
