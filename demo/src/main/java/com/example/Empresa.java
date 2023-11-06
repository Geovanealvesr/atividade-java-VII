package com.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaPagamento() {
        double totalSalarios = 0;
        for (Funcionario funcionario : funcionarios) {
            totalSalarios += funcionario.getSalario();
        }
        return totalSalarios;
    }

    public String getNome() {
        return nome;
    }
}
