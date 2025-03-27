package dev.java10x.Cadastro.Missoes;

import dev.java10x.Cadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missões")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    // @OneToMany : Uma missão para muitos ninjas.
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;
}
