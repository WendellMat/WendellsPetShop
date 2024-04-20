package br.dcx.ufpb.wendell.petShop;

import javax.swing.*;
import java.awt.*;

public class GUIV1 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon dogImg = new ImageIcon("./cachorro1.jpg");
    JButton botaoAdicionar, botaoPesquisar, botaoRemover;
    PetShop petShop = new WendellsPetShop();

    public GUIV1() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension d = t.getScreenSize();
        setTitle("Estoque PetShop");
        setSize(500, 650);
        int x = (d.width - getWidth()) / 2;
        int y = (d.height - getHeight()) / 2;
        setLocation(x, y);
        setResizable(false);
        getContentPane().setBackground(Color.cyan);
        linha1 = new JLabel("Estoque PetShop", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Times New Roman", Font.TRUETYPE_FONT, 24));
        linha2 = new JLabel(dogImg, JLabel.CENTER);
        botaoAdicionar = new JButton("Adicionar");
        botaoAdicionar.addActionListener(new AddController(petShop, this));
        botaoPesquisar = new JButton("Pesquisar");
        botaoPesquisar.addActionListener(new SearchController(petShop, this));
        botaoRemover = new JButton("Remover");
        botaoRemover.addActionListener(new RemoveController(petShop, this));
        getContentPane().setLayout(new GridLayout(5,1));
        getContentPane().add(linha1);
        getContentPane().add(linha2);
        getContentPane().add(botaoAdicionar);
        getContentPane().add(botaoPesquisar);
        getContentPane().add(botaoRemover);
    }

    public static void main(String [] args){
        JFrame janela = new GUIV1();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
