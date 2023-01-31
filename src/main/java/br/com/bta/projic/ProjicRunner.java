package br.com.bta.projic;

import br.com.bta.projic.enums.Linguagem;
import br.com.bta.projic.enums.Modalidade;
import br.com.bta.projic.enums.Status;
import br.com.bta.projic.enums.TipoOrientador;
import br.com.bta.projic.model.Curso;
import br.com.bta.projic.model.Orientador;
import br.com.bta.projic.model.OrientadoresProjeto;
import br.com.bta.projic.model.Projeto;
import br.com.bta.projic.repository.CursoRepository;
import br.com.bta.projic.repository.OrientadorRepository;
import br.com.bta.projic.repository.OrientadoresProjetoRepository;
import br.com.bta.projic.repository.ProjetoRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

@Component
public class ProjicRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(ProjicRunner.class);

    @Autowired
    private ProjetoRepository projetoRepository;

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private OrientadorRepository orientadorRepository;

    @Autowired
    private OrientadoresProjetoRepository orientadoresProjetoRepository;

    @Override
    public void run(String... args) throws Exception {
        var curso1 = new Curso("curso zica1", "cz1");
        var curso2 = new Curso("curso zica2", "cz2");
        cursoRepository.save(curso1);
        cursoRepository.save(curso2);
        
        var orientador1 = new Orientador("orientador1", "120983", "https://salve1.com/", "emai1@salve.com");
        var orientador2 = new Orientador("orientador2", "321233", "https://salve2.com/", "emai2@salve.com");
        orientadorRepository.save(orientador1);
        orientadorRepository.save(orientador2);

        var proj1 = new Projeto("proj1", "proj1", "projeto zikaaa1", "projeto_zika1.pdf", 55, 10,    LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae1", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso1);
        var proj2 = new Projeto("proj2", "proj2", "projeto zikaaa2", "projeto_zika2.pdf", 512, 25,   LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae2", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso2);
        var proj3 = new Projeto("proj3", "proj3", "projeto zikaaa3", "projeto_zika3.pdf", 5, 1,      LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae3", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso1);
        var proj4 = new Projeto("proj4", "proj4", "projeto zikaaa4", "projeto_zika4.pdf", 12, 0,     LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae4", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso2);
        var proj5 = new Projeto("proj5", "proj5", "projeto zikaaa5", "projeto_zika5.pdf", 1, 0,      LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae5", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso1);
        var proj6 = new Projeto("proj6", "proj6", "projeto zikaaa6", "projeto_zika6.pdf", 2090, 100, LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae6", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso2);
        var proj7 = new Projeto("proj7", "proj7", "projeto zikaaa7", "projeto_zika7.pdf", 90, 10,    LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae7", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso1);
        proj3.setAtivo(false);
        proj6.setAtivo(false);
        proj7.setAtivo(false);
        projetoRepository.save(proj1);
        projetoRepository.save(proj2);
        projetoRepository.save(proj3);
        projetoRepository.save(proj4);
        projetoRepository.save(proj5);
        projetoRepository.save(proj6);
        projetoRepository.save(proj7);

        var orientadoresProjeto11 = new OrientadoresProjeto(proj1, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto12 = new OrientadoresProjeto(proj1, orientador1, TipoOrientador.CoOrientador);
        var orientadoresProjeto21 = new OrientadoresProjeto(proj2, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto22 = new OrientadoresProjeto(proj2, orientador2, TipoOrientador.CoOrientador);
        var orientadoresProjeto31 = new OrientadoresProjeto(proj3, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto32 = new OrientadoresProjeto(proj3, orientador2, TipoOrientador.CoOrientador);
        var orientadoresProjeto41 = new OrientadoresProjeto(proj4, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto42 = new OrientadoresProjeto(proj4, orientador2, TipoOrientador.CoOrientador);
        var orientadoresProjeto51 = new OrientadoresProjeto(proj5, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto52 = new OrientadoresProjeto(proj5, orientador2, TipoOrientador.CoOrientador);
        var orientadoresProjeto61 = new OrientadoresProjeto(proj6, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto62 = new OrientadoresProjeto(proj6, orientador2, TipoOrientador.CoOrientador);
        var orientadoresProjeto71 = new OrientadoresProjeto(proj7, orientador1, TipoOrientador.Orientador);
        var orientadoresProjeto72 = new OrientadoresProjeto(proj7, orientador2, TipoOrientador.CoOrientador);
        orientadoresProjetoRepository.save(orientadoresProjeto11);
        orientadoresProjetoRepository.save(orientadoresProjeto12);
        orientadoresProjetoRepository.save(orientadoresProjeto21);
        orientadoresProjetoRepository.save(orientadoresProjeto22);
        orientadoresProjetoRepository.save(orientadoresProjeto31);
        orientadoresProjetoRepository.save(orientadoresProjeto32);
        orientadoresProjetoRepository.save(orientadoresProjeto41);
        orientadoresProjetoRepository.save(orientadoresProjeto42);
        orientadoresProjetoRepository.save(orientadoresProjeto51);
        orientadoresProjetoRepository.save(orientadoresProjeto52);
        orientadoresProjetoRepository.save(orientadoresProjeto61);
        orientadoresProjetoRepository.save(orientadoresProjeto62);
        orientadoresProjetoRepository.save(orientadoresProjeto71);
        orientadoresProjetoRepository.save(orientadoresProjeto72);

        logger.info("# of projects: {}", projetoRepository.count());

        var projetos = projetoRepository.findAll();

        logger.info("All projects unsorted:");
        logger.info("{}", projetos);
        logger.info("------------------------");

        var sortedoffices = projetoRepository.findAll(Sort.by(Sort.Direction.DESC, "titulo"));

        logger.info("All projects sorted by title in descending order");
        logger.info("{}", sortedoffices);
        logger.info("# of projects: {}", projetoRepository.count());

    }
}