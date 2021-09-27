import atividade12.Contribuentes;
import atividade12.PessoaFisica;
import atividade12.PessoaJuridica;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Contribuentes> cont = new ArrayList<>();

        System.out.println("Digite o numero de contribuentes que irá cadastrar:");
        int n = sc.nextInt();

        for (int i = 0 ; i<n; i++) {

            System.out.println("Digite 1 para pessoa fisica ou 2 para pessoa juridica:");
            int p = sc.nextInt();
            if (p==1){
                System.out.println("Digite o nome:");
                String nome = sc.next();
                System.out.println("Digite a renda:");
                Double renda = sc.nextDouble();
                System.out.println("Digite os gastos com saude:");
                Double saude = sc.nextDouble();
                PessoaFisica pf = new PessoaFisica(nome,renda,saude);
                cont.add(pf);
            }
            else if (p==2){
                System.out.println("Digite o nome:");
                String nome = sc.next();
                System.out.println("Digite a renda:");
                Double renda = sc.nextDouble();
                System.out.println("Digite o numero de funcionarios na empresa:");
                Integer funcionarios = sc.nextInt();
                PessoaJuridica pj = new PessoaJuridica(nome,renda,funcionarios);
                cont.add(pj);
            }
            else
            {
                System.out.println("ERRO!");}


    }

        for (Contribuentes lista: cont) {
            System.out.println(lista.imposto());
        }

}
}
