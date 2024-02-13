package br.com.rodrigoger.EntidadesDominio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "Senha")
public class Senha {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sen_id")
    private Integer id;

    @Column(name="sen_senha")
    private String senha;
}
