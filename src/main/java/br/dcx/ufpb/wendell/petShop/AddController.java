package br.dcx.ufpb.wendell.petShop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddController implements ActionListener {
    private PetShop petShop;
    private JFrame janelaPrincipal;

    public AddController(PetShop petShop, JFrame janela) {
        this.petShop = petShop;
        this.janelaPrincipal = janela;
    }

    public void actionPerformed(ActionEvent e) {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o código do produto?"));
        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Qual o nome do produto?");
        String descricao = JOptionPane.showInputDialog(janelaPrincipal,
                "Descreva um pouco do produto");
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,
                "Quantos dele você tem a disposição em seu estoque?"));
        boolean cadastrou = petShop.cadastraProduto(codigo, nome, descricao, quantidade);
        if (cadastrou){
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Produto cadastrado");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Produto não foi cadastrado. " +
                            "Verifique se já não existia");
        }
    }
}
