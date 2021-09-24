package atividade8;

public class ContaCnpj extends ContaCpf {

    private Double limiteEmprestimo = 50000.00;

    public ContaCnpj() {
        super();
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimos (Double valor) {
        if (valor <= limiteEmprestimo) {
            Double somaEmp = valor + saldo;
        }

        else {
            System.out.println("Emprestimo invalido.");
        }

    }

    @Override
    public String toString() {
        return "O titular da conta é: "
                + titular
                + " com CNPJ: "
                + numero
                + " tem o saldo de: R$"
                + saldo;

    }
}
