package dev.java10x.Cadastro.Ninjas;

import dev.java10x.Cadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Entity transforma uma classe em uma entidade do BD
// JPA = Java Persistence API
@Entity
@Table(name = "tb_cadastro")
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    @OneToMany(mappedBy = "ninja", cascade = CascadeType.ALL)
    private List<MissoesModel> missoes;

    public NinjaModel() {}

    public NinjaModel(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public List<MissoesModel> getMissoes() { return missoes; }
    public void setMissoes(List<MissoesModel> missoes) { this.missoes = missoes; }

}
