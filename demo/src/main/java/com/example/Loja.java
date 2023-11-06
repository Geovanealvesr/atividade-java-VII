package com.example;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0;
        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

}
