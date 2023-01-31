package br.com.bta.projic.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
@Entity
@Table(name = "curso")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Curso {
    
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
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE) 
    private UUID id;
    private String nome;
    private String abreviacao;
    
    @JsonIgnore
    private Boolean ativo;

    //@ManyToOne
    //Usuario usuario;
}
