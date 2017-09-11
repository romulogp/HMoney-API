package br.com.hustik.hmoney.api.repository.lancamento;

import br.com.hustik.hmoney.api.model.Lancamento;
import br.com.hustik.hmoney.api.repository.filter.LancamentoFilter;
import br.com.hustik.hmoney.api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface LancamentoRepositoryQuery {

    Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
