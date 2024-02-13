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
@Table(name="AgendasProvas")
public class AgendaProvas {
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
