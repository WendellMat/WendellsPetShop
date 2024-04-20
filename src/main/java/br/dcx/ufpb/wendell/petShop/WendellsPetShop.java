package br.dcx.ufpb.wendell.petShop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class WendellsPetShop implements PetShop{
    private Map<Integer, Produto> produtos;
    private GravadorDeDados gravador = new GravadorDeDados();

    public WendellsPetShop() {
        this.produtos = new HashMap<>();
        recuperaDados();
    }

    public void salvarDados() {
        try {
            this.gravador.salvarProdutos(this.produtos);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void recuperaDados() {
        try {
            this.produtos = this.gravador.recuperarProdutos();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean cadastraProduto(Integer codigo, String nome, String descricao, int quantidade) {
        if (!produtos.containsKey(codigo)) {
            this.produtos.put(codigo, new Produto(codigo, nome, descricao, quantidade));
            try {
                gravador.salvarProdutos(this.produtos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return true;
        } else {
            return false;
        }
    }

    public Collection<Produto> pesquisaProdutos(String nome) {
        Collection<Produto> produtosAchados = new ArrayList<>();
        for (Produto p : this.produtos.values()) {
            if (p.getNome().startsWith(nome)) {
                produtosAchados.add(p);
            }
        }
        return produtosAchados;
    }

    public boolean removeProduto(Integer codigo) {
        if (this.produtos.containsKey(codigo)) {
            this.produtos.remove(codigo);
            try {
                gravador.salvarProdutos(this.produtos);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return true;
        } else {
            return false;
        }
    }

}
