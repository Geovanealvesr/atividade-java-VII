package com.example;

import java.util.ArrayList;
import java.util.List;

public class Escola {
      private List<Professor> professores;
    private List<Aluno> alunos;

    public Escola() {
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarProfessores() {
        System.out.println("Professores na escola:");
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }
    }

    public void listarAlunos() {
        System.out.println("Alunos na escola:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
