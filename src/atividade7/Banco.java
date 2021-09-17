package atividade7;

import java.io.InputStream;

public class Banco {
    private String nome;
    private long conta;
    private double deposito;
    private double saque;
    private double depositoNovo;


    public Banco(InputStream in) {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDepositoNovo(double depositoNovo) {
        this.depositoNovo = depositoNovo;
    }

    public double getDepositoNovo() {
        return depositoNovo;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getSaque() {
        return saque;
    }

    public double resultadoSaque() {
        double total = deposito - saque;
        return total - 5;
    }



    public double calcularResultadoNovoDeposito() {
        return deposito + depositoNovo;
    }


}
