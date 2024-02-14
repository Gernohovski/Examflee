package br.com.rodrigoger.EntidadesDominio;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="AgendasProvas")
public class AgendaProvas implements EntidadeDominio{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="agp_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="usr_id")
    private Usuarios usuario;

    @OneToMany
    @JoinColumn(name="avl_id")
    private List<Avaliacoes> avaliacoes;
}
