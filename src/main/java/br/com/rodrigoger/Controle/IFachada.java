package br.com.rodrigoger.Controle;

import br.com.rodrigoger.EntidadesDominio.EntidadeDominio;

import java.util.List;

public interface IFachada {
    EntidadeDominio salvar(EntidadeDominio entidade);
    EntidadeDominio atualizar(EntidadeDominio entidade, Integer id);
    void deletar(EntidadeDominio entidade, Integer id);
}
