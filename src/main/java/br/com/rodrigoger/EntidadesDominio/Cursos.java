package br.com.rodrigoger.EntidadesDominio;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name="Cursos")
public class Cursos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "crs_id")
    private Integer id;

    @Column(name="crs_nome")
    private String nome;
}
