package com.example;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List<Aluno> alunos;

    public Turma() {
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public double calcularMediaIdade() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        int totalIdades = 0;
        for (Aluno aluno : alunos) {
            totalIdades += aluno.getIdade();
        }

        return (double) totalIdades / alunos.size();
    }
}