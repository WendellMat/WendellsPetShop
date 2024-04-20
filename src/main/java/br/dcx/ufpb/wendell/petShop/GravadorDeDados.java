package br.dcx.ufpb.wendell.petShop;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    public static final String ARQUIVO_PRODUTOS = "produtos.dat";

    public HashMap<Integer, Produto> recuperarProdutos() throws IOException {
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(new FileInputStream(ARQUIVO_PRODUTOS));
            return (HashMap<Integer, Produto>) in.readObject();
        } catch (Exception e) {
            System.out.println("Não foi possível recuperar os produtos");
            throw new IOException("Não foi possível recuperar os dados do arquivo " + ARQUIVO_PRODUTOS);
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

    public void salvarProdutos(Map<Integer, Produto> produtos) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_PRODUTOS));
            out.writeObject(produtos);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Erro ao salvar os produtos no arquivo " + ARQUIVO_PRODUTOS);
        }
    }

}
