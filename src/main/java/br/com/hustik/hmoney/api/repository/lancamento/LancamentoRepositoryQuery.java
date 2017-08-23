package br.com.hustik.hmoney.api.repository.lancamento;

import br.com.hustik.hmoney.api.model.Lancamento;
import br.com.hustik.hmoney.api.repository.filter.LancamentoFilter;

import java.util.List;

public interface LancamentoRepositoryQuery {

    List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
