package com.example;

public class Circulo {
    
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        double valorPi = 3.14159;
        return valorPi * raio * raio;
    }

    public double calcularPerimetro(){
        double valorPi = 3.14159;
        return 2 * valorPi * raio;
    }
    
}
