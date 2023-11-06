package com.example;

public class Main {
    public static void main(String[] args) {
        /*
         * 1°
         * 
         * Carro golf = new Carro("Golf", "Volkswagen", 2018);
         * golf.imprimirCarro();
         */

        /*
         * 2°
         * 
         * Circulo bola = new Circulo(5);
         * double area = bola.calcularArea();
         * double perimetro = bola.calcularPerimetro();
         * 
         * System.out.println("Área do circulo: " + area);
         * System.out.println("Perimetro do circulo: " + perimetro);
         */

        /*
         * 3°
         * 
         * Pessoa pessoa1 = new Pessoa("Geovane", 23);
         * pessoa1.apresentar();
         */

        /*
         * 4°
         * 
         * ContaBancaria conta4544 = new ContaBancaria();
         * conta4544.depositar(1545.00);
         * System.out.println("Saldo atual: " + conta4544.verSaldo() );
         * conta4544.sacar(1540.00);
         * System.out.println("Saldo atual: " + conta4544.verSaldo() );
         */

        /*
         * 5°
         * 
         * Biblioteca minhaBiblioteca = new Biblioteca();
         * 
         * Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal",
         * "J. K. Rowling");
         * Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
         * Livro livro3 = new Livro("A Droga da Obediência", "Pedro Bandeira");
         * 
         * minhaBiblioteca.adicionarLivro(livro1);
         * minhaBiblioteca.adicionarLivro(livro2);
         * minhaBiblioteca.adicionarLivro(livro3);
         * 
         * System.out.println("Livros na biblioteca:");
         * minhaBiblioteca.listarLivros();
         * 
         * int totalLivros = minhaBiblioteca.contarLivros();
         * System.out.println("Total de livros na biblioteca: " + totalLivros);
         */

        /*
         * 6°
         * 
         * Casa minhaCasa = new Casa();
         * 
         * Movel movel1 = new Movel("Sofá");
         * Movel movel2 = new Movel("Mesa de Jantar");
         * Movel movel3 = new Movel("Cama");
         * 
         * minhaCasa.adicionarMovel(movel1);
         * minhaCasa.adicionarMovel(movel2);
         * minhaCasa.adicionarMovel(movel3);
         * 
         * minhaCasa.listarMoveis();
         */

        /*
         * 7°
         * 
         * Turma minhaTurma = new Turma();
         * 
         * Aluno aluno1 = new Aluno("João", 20);
         * Aluno aluno2 = new Aluno("Maria", 22);
         * Aluno aluno3 = new Aluno("Pedro", 19);
         * 
         * minhaTurma.adicionarAluno(aluno1);
         * minhaTurma.adicionarAluno(aluno2);
         * minhaTurma.adicionarAluno(aluno3);
         * 
         * double mediaIdade = minhaTurma.calcularMediaIdade();
         * System.out.println("Média de idade dos alunos na turma: " + mediaIdade);
         */

        /*
         * 8° Empresa vivo = new Empresa("Vivo (Telefonica)");
         * 
         * Funcionario funcionario1 = new Funcionario("Wander", 3000);
         * Funcionario funcionario2 = new Funcionario("Samuel", 3500);
         * Funcionario funcionario3 = new Funcionario("Paulo", 2800);
         * 
         * vivo.adicionarFuncionario(funcionario1);
         * vivo.adicionarFuncionario(funcionario2);
         * vivo.adicionarFuncionario(funcionario3);
         * 
         * double folhaPagamentoTotal = vivo.calcularFolhaPagamento();
         * 
         * System.out.println("A folha de pagamento total da empresa " + vivo.getNome()
         * + " é de R$" + folhaPagamentoTotal);
         */

       /* 9°  Escola escolaGamma = new Escola();

        Professor profBackEnd = new Professor("Lucas Neris");
        Professor profFrontEnd = new Professor("Hendy Almeida");

        Aluno aluno3 = new Aluno("Geovane", 23);
        Aluno aluno4 = new Aluno("Thiago", 20);

        escolaGamma.adicionarProfessor(profBackEnd);
        escolaGamma.adicionarProfessor(profFrontEnd);

        escolaGamma.adicionarAluno(aluno3);
        escolaGamma.adicionarAluno(aluno4);

        escolaGamma.listarAlunos();
        escolaGamma.listarProfessores();
        */

        Loja reserva = new Loja();

        Produto camisa1 = new Produto("Camiseta Basica", 50);
        Produto calca1 = new Produto("Calça", 40.0);
        Produto tenis1 = new Produto("Tênis", 60.0);

        reserva.adicionarProduto(camisa1);
        reserva.adicionarProduto(calca1);
        reserva.adicionarProduto(tenis1);

        double precoTotal = reserva.calcularPrecoTotal();
        System.out.println("O preço total é R$" + precoTotal );
    }   

}