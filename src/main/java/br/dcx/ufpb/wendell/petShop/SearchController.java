package br.dcx.ufpb.wendell.petShop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class SearchController implements ActionListener {
    private PetShop petShop;
    private JFrame janelaPrincipal;

    public SearchController(PetShop petShop, JFrame janela) {
        this.petShop = petShop;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        String nomeDoProdutoAProcurar = JOptionPane.showInputDialog(janelaPrincipal,
                "Digite o nome do produto que você deseja procurar");
        Collection<Produto> produtosEncontrados = petShop.pesquisaProdutos(nomeDoProdutoAProcurar);
        if (produtosEncontrados.size() > 0) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Produtos encontrados:");
            for (Produto p : produtosEncontrados) {
                JOptionPane.showMessageDialog(janelaPrincipal, p.toString());
            }
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Não foi encontrado nenhum produto que iniciasse com esse nome");
        }
    }
}
