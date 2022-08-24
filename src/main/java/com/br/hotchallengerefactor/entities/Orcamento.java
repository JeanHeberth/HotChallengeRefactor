package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class Orcamento extends GenericDomain {


    private Double valor;

    private Date dataInicio;

    private Date dataFinal;

}
