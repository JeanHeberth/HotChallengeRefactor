package com.br.hotchallengerefactor.entities;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@SuppressWarnings("serial")
@MappedSuperclass
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericDomain implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
