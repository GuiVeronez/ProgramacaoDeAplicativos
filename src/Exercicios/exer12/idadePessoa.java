package Exercicios.exer12;

public class idadePessoa {

    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de Idade. ");
        } else {
            System.out.println("Menor de Idade. ");
        }
    }
}
