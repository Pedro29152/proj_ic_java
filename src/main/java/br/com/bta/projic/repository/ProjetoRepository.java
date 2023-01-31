package br.com.bta.projic.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.bta.projic.model.Projeto;

public interface ProjetoRepository extends ListCrudRepository<Projeto, UUID>, PagingAndSortingRepository<Projeto, UUID> {
    
    public Page<Projeto> findByAtivoTrue(Pageable pageable);

    public Optional<Projeto> findByIdAndAtivoTrue(UUID id);
    
    public Optional<Projeto> findByIdAndAtivoFalse(UUID id);

    public List<Projeto> findByAtivoTrue();

    public List<Projeto> findByAtivoFalse();
}
