package com.example;

import java.util.ArrayList;
import java.util.List;

public class Casa {
    private List<Movel> moveis;

    public Casa() {
        moveis = new ArrayList<>();
    }

    public void adicionarMovel(Movel movel) {
        moveis.add(movel);
    }

    public void listarMoveis() {
        System.out.println("Móveis presentes na casa:");
        for (Movel movel : moveis) {
            System.out.println(movel.getNome());
        } }
    
    }
