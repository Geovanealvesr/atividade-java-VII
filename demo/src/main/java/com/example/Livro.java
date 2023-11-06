package com.example;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

 class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }
    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }
    }

    public int contarLivros() {
        return livros.size();
    }

}