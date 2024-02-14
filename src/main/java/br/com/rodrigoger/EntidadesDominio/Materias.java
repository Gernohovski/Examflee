package br.com.rodrigoger.EntidadesDominio;

import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "Materias")
public class Materias implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mat_id")
    private Integer id;

    @Column(name = "mat_nome")
    private String nome;
}
