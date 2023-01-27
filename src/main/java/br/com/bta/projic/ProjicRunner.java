package br.com.bta.projic;

import br.com.bta.projic.enums.Linguagem;
import br.com.bta.projic.enums.Modalidade;
import br.com.bta.projic.enums.Status;
import br.com.bta.projic.model.Curso;
import br.com.bta.projic.model.Projeto;
import br.com.bta.projic.repository.CursoRepository;
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

    @Override
    public void run(String... args) throws Exception {
        var curso = new Curso("curso zica", "csz");
        cursoRepository.save(curso);

        projetoRepository.save(new Projeto("proj1", "proj1", "projeto zikaaa1", "projeto_zika1.pdf", 55, 10,    LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae1", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj2", "proj2", "projeto zikaaa2", "projeto_zika2.pdf", 512, 25,   LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae2", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj3", "proj3", "projeto zikaaa3", "projeto_zika3.pdf", 5, 1,      LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae3", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj4", "proj4", "projeto zikaaa4", "projeto_zika4.pdf", 12, 0,     LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae4", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj5", "proj5", "projeto zikaaa5", "projeto_zika5.pdf", 1, 0,      LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae5", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj6", "proj6", "projeto zikaaa6", "projeto_zika6.pdf", 2090, 100, LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae6", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));
        projetoRepository.save(new Projeto("proj7", "proj7", "projeto zikaaa7", "projeto_zika7.pdf", 90, 10,    LocalDate.of(2022, 06, 01), LocalDateTime.of(2022,06,02, 16,0,0), "https://eae.com/eae7", Status.Aceito, Linguagem.PT, Modalidade.ArtigoCientifico, curso));

        logger.info("# of offices: {}", projetoRepository.count());
        logger.info("All offices unsorted:");

        var offices = projetoRepository.findAll();

        logger.info("{}", offices);
        logger.info("------------------------");
        logger.info("All offices sorted by name_of_office in descending order");

        var sortedoffices = projetoRepository.findAll(Sort.by(Sort.Direction.DESC, "titulo"));

        logger.info("{}", sortedoffices);
        logger.info("------------------------");
        logger.info("Deleting all offices");

        logger.info("# of offices: {}", projetoRepository.count());
    }
}