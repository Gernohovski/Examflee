package br.com.rodrigoger.EntidadesDominio;

public class Usuarios extends Pessoas {
    private Senha senha;
    private Faculdades faculdade;
    private Cursos curso;

    public Usuarios(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }
}
