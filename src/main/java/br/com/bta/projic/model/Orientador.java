package br.com.bta.projic.model;

import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "orientador")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Orientador {
    
    public Orientador(String nome, String ra, String currLattes, String email) {
        this.nome = nome;
        this.ra = ra;
        this.currLattes = currLattes;
        this.email = email;

        this.ativo = true;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE) 
    private UUID id;

    private String nome;
    private String ra;
    private String currLattes;
    private String email;

    @JsonIgnore
    private Boolean ativo;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "orientador")
    private List<OrientadoresProjeto> projetos;

    //@ManyToOne
    //private Usuario usuario;
}
