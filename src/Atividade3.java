import atividade3.Retangulo;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.println("Digite a altura do retangulo: ");
        retangulo.a = sc.nextDouble();
        System.out.println("Digite a base do retangulo: ");
        retangulo.b = sc.nextDouble();
        System.out.println("A área do retangulo é de: " + retangulo.area());
        sc.close();
    }
}
