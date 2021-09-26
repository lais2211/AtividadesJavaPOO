import atividade9.Empregado;
import atividade9.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();

        System.out.println("Digite o numero de funcionarios a serem cadastrados:");
        int nf = sc.nextInt();


        for (int i = 0; i < nf; i++) {

            System.out.println("O funcionario é: 1) CLT ou 2) terceirizado");
            int n = sc.nextInt();

            if (n == 1) {

                System.out.println("Digite o nome do funcionario:");
                String nome = sc.next();
                System.out.println("Digite as horas trabalhadas:");
                Integer horas = sc.nextInt();
                System.out.println("Digite o valor recebido por hora:");
                Double valorHoras = sc.nextDouble();
                Empregado lista = new Empregado(nome, horas, valorHoras);
                list.add(lista);
            } else {

                System.out.println("Digite o nome do funcionario:");
                String nome = sc.next();
                System.out.println("Digite as horas trabalhadas:");
                Integer horas = sc.nextInt();
                System.out.println("Digite o valor recebido por hora:");
                Double valorHoras = sc.nextDouble();
                System.out.println("Digite o valor extra a ser pago:");
                Double extra = sc.nextDouble();
                Empregado lista2 = new Terceirizado(nome, horas, valorHoras, extra);
                list.add(lista2);
            }
        }
        System.out.println("Pagamentos: ");
        for (Empregado lista : list) {

            System.out.println(lista.getNome() + ": " + lista.pagamento());

        }

sc.close();    }
}
