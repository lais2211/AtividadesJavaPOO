package atividade4;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;
    public double acressimo;

    public double salarioLiquido() {
        return salario - imposto;
    }

    public double salarioliquido2() {
        double valor = salario / 100;
        return (valor * 10) + salario - imposto;
    }


}
