package br.com.rodrigoger.EntidadesDominio;

import lombok.*;
import javax.persistence.*;

@Data

@Entity
@Table(name = "Senha")
public class Senha implements EntidadeDominio{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sen_id")
    private Integer id;

    @Column(name="sen_senha")
    private String senha;
}
