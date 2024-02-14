package br.com.rodrigoger.EntidadesDominio;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name="Professores")
public class Professores implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prf_id")
    private Integer id;

    @Column(name = "prf_nome")
    private String nome;

    @Column(name = "prf_cpf")
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "mat_id")
    private Materias materia;
}
