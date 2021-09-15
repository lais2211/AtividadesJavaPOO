import banco.Banco;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco(System.in);
        System.out.println("Digite o nome do dono (a) da conta: ");
        String nome = sc.nextLine();
        System.out.println("Digite o CPF do titular da conta: ");
        long conta = sc.nextLong();
        System.out.println("Irá fazer seu primeiro deposito agora? Digite 1 para Sim ou digite 2 para Não.");
        int S_N = sc.nextInt();

        if (S_N == 1) {
            System.out.println("Digite o valor do seu deposito: ");
            double deposito = sc.nextDouble();
            System.out.println(nome + " o valor atual na sua conta é de R$" + deposito);
            banco.setDeposito(deposito);
        } else {
            double deposito = 0;
            System.out.println(nome + " o valor atual na sua conta é de R$0,00");
            banco.setDeposito(deposito);
        }


        System.out.println("Caso queira alterar o nome, digite 1, senão digite 2:");
        int S_N2 = sc.nextInt();
        if (S_N2 == 1) {
            System.out.println("Digite o nome novo:");
            nome = sc.nextLine();
            banco.setNome(sc.nextLine());
            System.out.println("Nome atualizado: " + banco.getNome());
        } else {
            banco.setNome(nome);
            System.out.println("Compreendido: " + nome);
        }


        System.out.println("Gostaria de fazer algum deposito novo? Se sim, digite 1, senao digite 2: ");
        int s_n3 = sc.nextInt();
        if (s_n3 == 1) {
            System.out.println("Digite o valor do deposito:");
            double depositoNovo = sc.nextDouble();
            banco.setDepositoNovo(depositoNovo);
            System.out.println(banco.getNome() + " seu saldo atual é de: R$" + banco.calcularResultadoNovoDeposito());
        } else {
            double depositoNovo = 0;
            banco.setDepositoNovo(depositoNovo);
            System.out.println(banco.getNome() + " o valor atual na sua conta é de R$" + banco.calcularResultadoNovoDeposito());
        }
        banco.setDeposito(banco.calcularResultadoNovoDeposito());

        System.out.println("Gostaria de fazer algum saque novo? Se sim, digite 1, senao digite 2: ");
        int s_n4 = sc.nextInt();
        if (s_n4 == 1) {
            System.out.println("Digite o valor do saque:");
            double saque = sc.nextDouble();
            banco.setSaque(saque);
            System.out.println(banco.getNome() + " seu saldo atual é de: R$" + banco.resultadoSaque());
        } else {
            double saque = 0;
            banco.setSaque(saque);
            System.out.println(banco.getNome() + " o valor atual na sua conta é de R$" + banco.getDeposito());
        }

        sc.close();
    }
}
