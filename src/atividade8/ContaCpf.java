package atividade8;

public class ContaCpf {

        protected long numero;
        protected String titular;
        protected Double saldo;
        private Double saque;
        private Double deposito;

        public ContaCpf(){}

            public long getNumero() {
            return numero;
        }

       public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public Double getSaldo() {
            return saldo;
        }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaque() {
            return saque;
        }

        public Double getDeposito() {
            return deposito;
        }

        public void setSaque(Double saque) {
            this.saque = saque;
        }

        public void setDeposito(Double deposito) {
            this.deposito = deposito;
        }

        public double somaSaque (Double saque) {

            return saldo = saldo - saque;

        }

        public double somaDeposito(Double valor) {

            return saldo = saldo + deposito;
        }

    @Override
    public String toString() {
        return "O titular da conta é: "
                + titular
                +" com CPF: "
                        +numero
                +" tem o saldo de: R$"
                + saldo;

    }
}



