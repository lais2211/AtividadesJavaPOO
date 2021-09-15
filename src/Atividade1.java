import triangulo.Triangulo;

import java.util.Scanner;


public class Atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();
        System.out.println("Digite 3 valores para a área do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite 3 valores para a área do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaX = x.area();
        double areaY = y.area();
        System.out.println("A area do triangulo Y é de: " + areaY);
        System.out.println("A area do triangulo X é de: " + areaX);
        if (areaX > areaY) {
            System.out.println("O triangulo x tem a area maior!");
        } else
            System.out.println("O triangulo Y tem a area maior!");

        sc.close();
    }
}
