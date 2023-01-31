package br.com.bta.projic.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bta.projic.enums.TipoOrientador;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "orientadores_projeto", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"projetoId", "tipoOrientador"})
})
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class OrientadoresProjeto {
    
    public OrientadoresProjeto(Projeto projeto, Orientador orientador, TipoOrientador tipoOrientador) {
        this.projeto = projeto;
        this.orientador = orientador;
        this.tipoOrientador = tipoOrientador;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE) 
    private UUID id;

    private TipoOrientador tipoOrientador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "projetoId")
    private Projeto projeto;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "orientadorId")
    private Orientador orientador;
    
}
