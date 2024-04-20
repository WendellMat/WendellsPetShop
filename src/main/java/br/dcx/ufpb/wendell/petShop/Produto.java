package br.dcx.ufpb.wendell.petShop;

import java.io.Serializable;

public class Produto implements Serializable {
    private int codigo;
    private String nome;
    private String descricao;
    private int quantidade;

    public Produto(int codigo, String nome, String descricao, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return
                "Código: " + this.codigo +
                "\nNome: " + this.nome +
                "\nDescrição: " + this.descricao +
                "\nQuantidade: " + this.quantidade;
    }
}
