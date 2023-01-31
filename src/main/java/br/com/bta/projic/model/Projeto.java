package br.com.bta.projic.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.bta.projic.enums.Linguagem;
import br.com.bta.projic.enums.Modalidade;
import br.com.bta.projic.enums.Status;
import br.com.bta.projic.serializer.Projeto_OrientadoresProjetoSerializer;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "projeto")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Projeto {

    public Projeto(
        String titulo,
        String subtitulo,
        String resumo,
        String nomeArquivo,
        int numVisitas,
        int numDownloads,
        LocalDate dataAvaliacao,
        LocalDateTime dataEnvio,
        String localPublicacao,
        Status status,
        Linguagem linguagem,
        Modalidade modalidade,
        Curso curso
    ) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.resumo = resumo;
        this.nomeArquivo = nomeArquivo;
        this.numVisitas= numVisitas;
        this.numDownloads= numDownloads;
        this.dataAvaliacao= dataAvaliacao;
        this.dataEnvio = dataEnvio;
        this.localPublicacao = localPublicacao;
        this.status = status;
        this.linguagem = linguagem;
        this.modalidade = modalidade;

        this.curso = curso;

        ativo = true;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @Setter(AccessLevel.PRIVATE) 
    private UUID id;
    private String titulo;
    private String subtitulo;
    private String resumo;
    private String nomeArquivo;
    private int numVisitas;
    private int numDownloads;
    private LocalDate dataAvaliacao;
    private LocalDateTime dataEnvio;
    private String localPublicacao;

    private Status status;
    private Linguagem linguagem;
    private Modalidade modalidade;
    
    @JsonIgnore
    private Boolean ativo;

    @JsonSerialize(contentUsing = Projeto_OrientadoresProjetoSerializer.class)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "projeto")
    private List<OrientadoresProjeto> orientadores;

    @ManyToOne
    private Curso curso;

    @Override
    public String toString() {
        return "id: " + id.toString() + ", titulo: " + titulo;
    }
}

