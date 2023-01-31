package br.com.bta.projic.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.Autor;

public interface AutorRepository extends ListCrudRepository<Autor, UUID>, PagingAndSortingRepository<Autor, UUID> {
    
}
