package com.example;

public class ContaBancaria {
    private double saldo;
  

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Foi depositado o valor de " + valor + ", a transação foi efetuada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }

        
    }
    public void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Foi sacado o valor de " + valor + ", a transação foi efetuada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido");
        }

        
    }
    
    public double verSaldo(){
            return saldo;
    }


}
