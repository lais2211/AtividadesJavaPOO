import atividade8.ContaCnpj;
import atividade8.ContaCpf;
import atividade8.ContaPoupança;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCpf cpf = new ContaCpf();
        ContaCnpj cnpj = new ContaCnpj();
        ContaPoupança poupança = new ContaPoupança();

        System.out.println("Deseja cadastrar conta com: Digite 1) Conta corrente, 2) CNPJ ou 3) Conta Poupança");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println();
            System.out.println("Digite o CPF: ");
            long numero = sc.nextLong();
            System.out.println("Digite o nome do titular: ");
            String titular = sc.next();
            System.out.println("Digite o valor de saldo atual: ");
            Double saldo = sc.nextDouble();
            cpf.setNumero(numero);
            cpf.setTitular(titular);
            cpf.setSaldo(saldo);

            System.out.println(cpf);

        } else if (n == 2) {
            System.out.println();
            System.out.println("Digite o CNPJ: ");
            long numero = sc.nextLong();
            System.out.println("Digite o nome do titular: ");
            String titular = sc.next();
            System.out.println("Digite o valor de saldo atual: ");
            Double saldo = sc.nextDouble();
            cnpj.setNumero(numero);
            cnpj.setTitular(titular);
            cnpj.setSaldo(saldo);
            System.out.println(cnpj);
        } else {

            System.out.println();
            System.out.println("Digite o CPF: ");
            long numero = sc.nextLong();
            System.out.println("Digite o nome do titular: ");
            String titular = sc.next();
            System.out.println("Digite o valor de saldo atual: ");
            Double saldo = sc.nextDouble();
            poupança.setNumero(numero);
            poupança.setTitular(titular);
            poupança.setSaldo(saldo);

            System.out.println(poupança);

        }

        System.out.println("Gostaria de fazer um deposito: Digite 1) para sim ou 2) para não.");
        int n2 = sc.nextInt();
        if (n2 == 1) {

            if (n == 1) {

                System.out.println("Digite o valor do deposito: ");
                Double deposito = sc.nextDouble();
                cpf.setDeposito(deposito);
                System.out.println("O valor atual da conta é de: R$" + cpf.somaDeposito(deposito));

            } else if (n == 2) {

                System.out.println("Digite o valor do deposito: ");
                Double deposito = sc.nextDouble();
                cnpj.setDeposito(deposito);
                System.out.println("O valor atual da conta é de: R$" + cnpj.somaDeposito(deposito));

            } else {

                System.out.println("Digite o valor do deposito: ");
                Double deposito = sc.nextDouble();
                poupança.setDeposito(deposito);
                System.out.println("O valor atual da conta é de: R$" + poupança.somaDeposito(deposito));

            }

        } else {

            if (n == 1) {

                System.out.println("O valor atual da conta é de: R$" + cpf.getSaldo());
            } else if (n == 2) {

                System.out.println("O valor atual da conta é de: R$" + cnpj.getSaldo());

            } else {

                System.out.println("O valor atual da conta é de: R$" + poupança.getSaldo());

            }

        }

        System.out.println("Gostaria de fazer um saque: Digite 1) para sim ou 2) para não.");
        int n3 = sc.nextInt();
        if (n3 == 1) {

            if (n == 1) {

                System.out.println("Digite o valor do saque: ");
                Double saque = sc.nextDouble();
                cpf.setSaque(saque);
                System.out.println("O valor atual da conta é de: R$" + cpf.somaSaque(saque));

            } else if (n == 2) {

                System.out.println("Digite o valor do saque: ");
                Double saque = sc.nextDouble();
                cnpj.setSaque(saque);
                System.out.println("O valor atual da conta é de: R$" + cnpj.somaSaque(saque));

            } else {
                System.out.println("Digite o valor do saque: ");
                Double saque = sc.nextDouble();
                poupança.setSaque(saque);
                System.out.println("O valor atual da conta é de: R$" + poupança.somaSaque(saque));


            }


        } else {

            if (n == 1) {

                System.out.println("O valor atual da conta é de: R$" + cpf.getSaldo());
            } else if (n == 2) {

                System.out.println("O valor atual da conta é de: R$" + cnpj.getSaldo());

            } else {

                System.out.println("O valor atual da conta é de: R$" + poupança.getSaldo());

            }
        }

        if (n == 1) {
            System.out.println("Muito obrigada pela atenção! Tenha um bom dia!");
        } else if (n == 2) {

            System.out.println("Muito obrigada pela atenção! Tenha um bom dia!");
        } else {
            System.out.println("Gostaria de fazer um emprestimo: Se sim digite 1, senão digite 2:");
            int n4 = sc.nextInt();

            if (n4 == 1) {
                System.out.println("Digite o valor do emprestimo:");
                Double emprestimo = sc.nextDouble();
                cnpj.emprestimos(emprestimo);
                System.out.println("Seu saldo após emprestimo é de: R$" + cnpj.getSaldo());
            } else {
                System.out.println("Muito obrigada pela atenção! Tenha um bom dia!");
            }
        }
    }
}