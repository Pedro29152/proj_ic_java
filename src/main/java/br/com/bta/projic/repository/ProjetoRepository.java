package br.com.bta.projic.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.Projeto;

public interface ProjetoRepository extends ListCrudRepository<Projeto, UUID>, PagingAndSortingRepository<Projeto, UUID> {
    
}
