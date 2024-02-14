package br.com.rodrigoger.EntidadesDominio;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name="Avaliacoes")
public class Avaliacoes implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "avl_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "prf_id")
    private Professores professor;

    @ManyToOne
    @JoinColumn(name ="mat_id")
    private Materias materia;

    @Column(name="avl_data")
    private LocalDate data;

}
