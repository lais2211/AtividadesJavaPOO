import dolar.Dolar;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dolar dolar = new Dolar();
        System.out.println("Digite quanto 1 dolar está valendo atualmente em reais:");
        dolar.valor = sc.nextDouble();
        System.out.println("Quantos dolares planeja comprar: ");
        dolar.compra = sc.nextDouble();
        System.out.println("O total a ser pago junto com 6% de juros de imposto será de R$" + dolar.total());
        sc.close();

    }
}
