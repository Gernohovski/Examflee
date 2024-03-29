package br.com.rodrigoger.Repositories;


import br.com.rodrigoger.EntidadesDominio.EntidadeDominio;

import java.util.List;

public interface IDAO {
    EntidadeDominio salvar(EntidadeDominio entidade);
    EntidadeDominio atualizar(EntidadeDominio entidade, Integer id);
    void deletar(EntidadeDominio entidade, Integer id);
    List<EntidadeDominio> listar();
    EntidadeDominio buscarPorId(Integer id);
}
