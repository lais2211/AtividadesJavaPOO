import produtos.Produtos;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produtos produto = new Produtos();
        System.out.println("Digite o nome do produto:");
        produto.nome = sc.nextLine();
        System.out.println("Digite o valor do produto:");
        produto.valor = sc.nextDouble();
        System.out.println("Digite a quantidade em estoque:");
        produto.quantidade = sc.nextInt();


        System.out.println("Nome: " + produto.nome);
        System.out.println("Valor: " + produto.valor);
        System.out.println("Quantidade em estoque: " + produto.quantidade);
        System.out.println("O valor do total de mercadorias em estoque é de: " + produto.valorTotalEmEstoque());


        System.out.println("Quantos produtos seram adicionados a essa categoria?");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);
        System.out.println("Quantidade atutal: " + produto.quantidade);
        System.out.println("Quantos produtos seram retirados dessa categoria?");
        int quantidade2 = sc.nextInt();
        produto.retirarProduto(quantidade2);
        System.out.println("Quantidade atutal: " + produto.quantidade);
        System.out.println("O valor do total de mercadorias em estoque é de: " + produto.valorTotalEmEstoque());
        sc.close();
    }
}