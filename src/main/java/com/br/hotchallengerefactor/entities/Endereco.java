package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class Endereco extends GenericDomain {



    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String rua;

    @Column(nullable = false)
    private String cep;

    @OneToOne(mappedBy = "endereco")
    private Funcionario funcionario;


}
