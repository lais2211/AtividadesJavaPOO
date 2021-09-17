import atividade5.Estudante;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        System.out.println("Digite o nome do aluno:");
        estudante.nome = sc.nextLine();
        System.out.println("Agora digite a nota do 1° bimestre (1 a 30):");
        estudante.nota1 = sc.nextDouble();
        System.out.println("Agora digite a nota do 2° bimestre (1 a 35):");
        estudante.nota2 = sc.nextDouble();
        System.out.println("Agora digite a nota do 3° bimestre (1 a 35):");
        estudante.nota3 = sc.nextDouble();
        System.out.println(estudante.nome + " tirou no semestre o total de: " + estudante.resultado());
        if (estudante.resultado() >= 60)
            System.out.println("Aprovado!");

        else
            System.out.println("Reprovado! Falta " + estudante.quantoFalta() + " para passar!");
        sc.close();
    }
}

