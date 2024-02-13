package br.com.rodrigoger.EntidadesDominio;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
@Table(name = "Faculdades")
public class Faculdades {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fcl_id")
    private Integer id;

    @Column(name = "fcl_nome")
    private String nome;

    @OneToMany
    @JoinColumn(name = "crs_id")
    private List<Cursos> cursos;
}
