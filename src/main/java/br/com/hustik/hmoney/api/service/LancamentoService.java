package br.com.hustik.hmoney.api.service;

import br.com.hustik.hmoney.api.model.Lancamento;
import br.com.hustik.hmoney.api.model.Pessoa;
import br.com.hustik.hmoney.api.repository.LancamentoRepository;
import br.com.hustik.hmoney.api.repository.PessoaRepository;
import br.com.hustik.hmoney.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.stereotype.Service;

@Service
public class LancamentoService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento) {
        Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
        if (pessoa == null || pessoa.isInativo()) {
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
