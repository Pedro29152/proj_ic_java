package br.com.bta.projic.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "curso")
public class Curso {
    
    public Curso() {

    }

    public Curso(
        String nome,
        String abreviacao
    ) {
        this.nome = nome;
        this.abreviacao = abreviacao;

        ativo = true;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter private UUID id;
    @Getter @Setter private String nome;
    @Getter @Setter private String abreviacao;
    
    @JsonIgnore
    @Getter @Setter private Boolean ativo;

    //@Getter @Setter Usuario usuario;
}
