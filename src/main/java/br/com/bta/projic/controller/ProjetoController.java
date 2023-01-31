package br.com.bta.projic.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bta.projic.repository.ProjetoRepository;

@RestController
@RequestMapping("/api")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    @GetMapping("/projetos")
    public ResponseEntity<?> postProjeto(Pageable pageable) {
        var ret = projetoRepository.findByAtivoTrue(pageable);
       
        return new ResponseEntity<>(
            ret, 
            ret.getSize() > 0 ? HttpStatus.OK : HttpStatus.NO_CONTENT
        );
    }

    @GetMapping("/projetos/{projId}")
    public ResponseEntity<?> getProjeto(@PathVariable("projId") UUID projId) {
        var ret = projetoRepository.findByIdAndAtivoTrue(projId);
        
        return new ResponseEntity<>(
            ret, 
            ret.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND
        );
    }
}
