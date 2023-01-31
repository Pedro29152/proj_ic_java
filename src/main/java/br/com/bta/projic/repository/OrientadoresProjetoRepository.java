package br.com.bta.projic.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.OrientadoresProjeto;

public interface OrientadoresProjetoRepository extends ListCrudRepository<OrientadoresProjeto, UUID>, PagingAndSortingRepository<OrientadoresProjeto, UUID>  {
    
}
