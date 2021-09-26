import atividade10.Produtos;
import atividade10.ProdutosImportados;
import atividade10.ProdutosUsados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Atividade10 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dataFormato = new SimpleDateFormat ("dd/MM/yyy");
        List <Produtos> prod = new ArrayList<>();

        System.out.println("Digite o numero de produtos que ira digitar:");
        int n = sc.nextInt();

        for (int i =0; i<n; i++ ) {

            System.out.println("Seu produto é: ");
            System.out.println("1) Novo Nacional / 2) Novo Importado / 3) Usado");
            int p = sc.nextInt();

            if (p == 1) {

                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor do produto: ");
                Double preço = sc.nextDouble();
                Produtos produto = new Produtos(nome, preço);
                prod.add(produto);
            } else if (p == 2) {

                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor do produto: ");
                Double preço = sc.nextDouble();
                System.out.println("Digite o valor da taxa da Alfandega:");
                Double taxa = sc.nextDouble();
                ProdutosImportados importados = new ProdutosImportados(nome, preço, taxa);
                prod.add(importados);
            } else if (p == 3) {

                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                System.out.println("Digite o valor do produto: ");
                Double preço = sc.nextDouble();
                System.out.println("Digite a data de fabricação: DD/MM/YYYY ");
                Date data = dataFormato.parse(sc.next());
                ProdutosUsados usados = new ProdutosUsados(nome, preço, data);
                prod.add(usados);
            } else {

                System.out.println("ERRO");
            }
        }

            for (Produtos lista: prod) {

                System.out.println(lista.etiqueta());

            }

       sc.close(); }


    }

