package br.com.bta.projic.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bta.projic.model.Projeto;
import br.com.bta.projic.repository.ProjetoRepository;

@RestController
@RequestMapping("/api")
public class ProjetoController {

    private ProjetoRepository projetoRepository;
    
    public ProjetoController(ProjetoRepository projetoRepository) {
        this.projetoRepository = projetoRepository;
    }

    @GetMapping("/projetos")
    public ResponseEntity<List<Projeto>> postProjeto() {
        var ret = projetoRepository.findAll();

        return new ResponseEntity<>(
            ret, 
            ret.size() > 0 ? HttpStatus.OK : HttpStatus.NO_CONTENT
        );
    }

    @GetMapping("/projetos/{projId}")
    public ResponseEntity<Optional<Projeto>> getProjeto(@PathVariable("projId") UUID projId) {
        Optional<Projeto> ret = projetoRepository.findById(projId);
        
        return new ResponseEntity<>(
            ret, 
            ret.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND
        );
    }
}
