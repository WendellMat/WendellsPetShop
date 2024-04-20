package br.dcx.ufpb.wendell.petShop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveController implements ActionListener {
    private PetShop petShop;
    private JFrame janelaPrincipal;

    public RemoveController(PetShop petShop, JFrame janela) {
        this.petShop = petShop;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        Integer codigoDoProdutoASerExcluido = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Digite o código do produto que você deseja excluir"));
        boolean removeu = petShop.removeProduto(codigoDoProdutoASerExcluido);
        if (removeu) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Produto removido com sucesso");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Produto não foi encontrado. " +
                    "Operação não realizada");
        }
    }
}
