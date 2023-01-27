package br.com.bta.projic.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.Curso;

public interface CursoRepository extends ListCrudRepository<Curso, UUID>, PagingAndSortingRepository<Curso, UUID> {
    
}
