package br.com.rodrigoger.EntidadesDominio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name="Avaliacoes")
public class Avaliacoes {

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
