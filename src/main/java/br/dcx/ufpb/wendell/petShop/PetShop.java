package br.dcx.ufpb.wendell.petShop;

import java.util.Collection;

public interface PetShop {

    boolean cadastraProduto(Integer codigo, String nome, String descricao, int quantidade);
    Collection<Produto> pesquisaProdutos(String nome);
    boolean removeProduto(Integer codigo);
}
