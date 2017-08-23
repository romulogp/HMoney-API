package br.com.hustik.hmoney.api.repository;

import br.com.hustik.hmoney.api.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {
}