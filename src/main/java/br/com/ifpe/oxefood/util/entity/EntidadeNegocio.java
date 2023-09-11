package br.com.ifpe.oxefood.util.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
public abstract class EntidadeNegocio implements Serializable {
@Id
@GeneratedValue(strategy =   GenerationType.SEQUENCE)
    private Long id;

    private Boolean habilitado;
}