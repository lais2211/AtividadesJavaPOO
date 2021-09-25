package atividade8;

public class ContaPoupança extends ContaCpf {

    private Double taxaJuros;

    public ContaPoupança() {
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void updateSaldo() {

        saldo = saldo + (saldo * taxaJuros);

    }

    @Override
    public double somaSaque(Double saque) {

        return saldo = saldo - saque;

    }

    @Override
    public String toString() {
        return "O titular da conta é: "
                + titular
                + " com CPF: "
                + numero
                + " tem o saldo de: R$"
                + saldo;


    }
}

