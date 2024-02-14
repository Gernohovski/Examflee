package br.com.rodrigoger.EntidadesDominio;


import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name="Cursos")
public class Cursos implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "crs_id")
    private Integer id;

    @Column(name="crs_nome")
    private String nome;
}
