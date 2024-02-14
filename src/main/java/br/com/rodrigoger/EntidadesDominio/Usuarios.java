package br.com.rodrigoger.EntidadesDominio;

import lombok.*;
import javax.persistence.*;

@Data

@Entity
@Table(name = "Usuarios")
public class Usuarios implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usr_id")
    private Integer id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_cpf")
    private String cpf;

    @OneToOne
    @JoinColumn(name = "sen_id")
    private Senha senha;

    @OneToOne
    @JoinColumn(name = "fcl_id")
    private Faculdades faculdade;

    @OneToOne
    @JoinColumn(name = "crs_id")
    private Cursos curso;
}
