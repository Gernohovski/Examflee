package br.com.rodrigoger.EntidadesDominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Pessoas {
    private Integer id;
    private String nome;
    private String cpf;
}
