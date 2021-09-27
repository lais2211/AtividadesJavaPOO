import atividade11.Circulo;
import atividade11.Cores;
import atividade11.Forma;
import atividade11.Retangulo;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List <Forma> formas = new ArrayList<>();

        System.out.println("Digite o numero de formas que ira digitar:");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {

            System.out.println("Qual forma você gostaria de saber a area: Digite 1)Circulo ou 2)Retangulo");
            int f = sc.nextInt();
            if (f == 1) {
                System.out.println("Qual a cor do circulo: VERMELHO/PRETO/BRANCO:");
                String cor = sc.next();
                System.out.println("Qual o valor do raio:");
                Double raio = sc.nextDouble();
                Circulo circulo = new Circulo(Cores.valueOf(cor), raio);
                formas.add(circulo);
            }
            if (f == 2) {

                System.out.println("Qual a cor do circulo: VERMELHO/PRETO/BRANCO:");
                String cor = sc.next();
                System.out.println("Qual o valor da largura:");
                Double largura = sc.nextDouble();
                System.out.println("Qual o valor da altura:");
                Double altura = sc.nextDouble();
                Retangulo retangulo = new Retangulo(Cores.valueOf(cor), largura, altura);
                formas.add(retangulo);

            }

        }


                for (Forma lista: formas) {

                System.out.println(lista.area());

            }

        sc.close();}

    }

