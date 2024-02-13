package br.com.rodrigoger.EntidadesDominio;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "Usuarios")
public class Usuarios {

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
