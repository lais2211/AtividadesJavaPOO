package atividade5;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double resultado() {
        return nota1 + nota2 + nota3;
    }

    public double quantoFalta() {
        return 60 - resultado();
    }

}
