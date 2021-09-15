import funcionario.Funcionario;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.println("Digite o nome do funcionario:");
        funcionario.nome = sc.nextLine();
        System.out.println("Digite seu salario bruto: ");
        funcionario.salario = sc.nextDouble();
        System.out.println("Digite o valor do imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println(funcionario.nome + " tem o salario liquido de: R$" + funcionario.salarioLiquido());
        System.out.println("Digite quantos porcento de acressimo no salario bruto: ");
        funcionario.acressimo = sc.nextDouble();
        System.out.println(funcionario.nome + " tem o salario liquido atualizado de: R$" + funcionario.salarioliquido2());
        sc.close();
    }
}
