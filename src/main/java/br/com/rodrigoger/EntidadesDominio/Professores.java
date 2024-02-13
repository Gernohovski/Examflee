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
@Table(name="Professores")
public class Professores {

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
