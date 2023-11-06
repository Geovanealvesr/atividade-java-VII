package com.example;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    // construtor

    public Carro(String modelo, String marca, int ano){
     this.modelo = modelo;
     this.marca = marca;
     this.ano = ano;
    } 

    public void imprimirCarro(){
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
    }
}
