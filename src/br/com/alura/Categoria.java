package br.com.alura;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    public String getNome;
    private Integer id;
    private String nome;

    private List<Produto> produtos = new ArrayList<Produto>();

    public Categoria(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
