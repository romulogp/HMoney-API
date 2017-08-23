package br.com.hustik.hmoney.api.repository;

import br.com.hustik.hmoney.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
