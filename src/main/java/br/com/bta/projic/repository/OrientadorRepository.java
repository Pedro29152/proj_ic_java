package br.com.bta.projic.repository;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.Orientador;

public interface OrientadorRepository extends ListCrudRepository<Orientador, UUID>, PagingAndSortingRepository<Orientador, UUID> {
    
}
