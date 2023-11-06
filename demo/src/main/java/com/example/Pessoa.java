package com.example;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public void apresentar(){
        System.out.println("Prazer meu nome é " + nome + ", e tenho " + idade + " anos de idade.");
    }
}
