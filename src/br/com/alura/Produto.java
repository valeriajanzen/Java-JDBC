package br.com.alura;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    public Produto(String nome, String descricao) {
        super();
        this.nome = nome;
        this.descricao = descricao;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public String getNome() {
        return nome;
    }

    public String toString() {
        return String.format("Produto criado foi: %d, %s,%s",
                this.id, this.nome, this.descricao);
    }
}
