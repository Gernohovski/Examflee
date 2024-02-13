package br.com.rodrigoger.EntidadesDominio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "Materias")
public class Materias {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mat_id")
    private Integer id;

    @Column(name = "mat_nome")
    private String nome;
}
