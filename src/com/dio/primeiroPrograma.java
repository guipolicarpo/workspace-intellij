package com.dio;

import com.dio.model.Gato;

import java.util.Objects;

public class primeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("O problema dos 3 corpos", 300);

        System.out.println(livro);

//        int a = 5;
//        int b = 35;

//
//
//        System.out.println("Soma: " + (a+b));
    }
}

class Livro{
    private String nome;
    private  int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livro() {
        super();
    }

    public String getNome() {
        return nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}
