package br.com.bta.projic.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import br.com.bta.projic.enums.Linguagem;
import br.com.bta.projic.enums.Modalidade;
import br.com.bta.projic.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "projeto")
public class Projeto {

    public Projeto () {

    }

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
        Curso curso) {
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
    @Getter private UUID id;
    @Getter @Setter private String titulo;
    @Getter @Setter private String subtitulo;
    @Getter @Setter private String resumo;
    @Getter @Setter private String nomeArquivo;
    @Getter @Setter private int numVisitas;
    @Getter @Setter private int numDownloads;
    @Getter @Setter private LocalDate dataAvaliacao;
    @Getter @Setter private LocalDateTime dataEnvio;
    @Getter @Setter private String localPublicacao;

    @Getter @Setter private Status status;
    @Getter @Setter private Linguagem linguagem;
    @Getter @Setter private Modalidade modalidade;

    @JsonIgnore
    @Getter @Setter private Boolean ativo;

    @ManyToOne
    @Getter @Setter private Curso curso;
}

