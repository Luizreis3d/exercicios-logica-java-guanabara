package passo01_sequenciasBasicas;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionário: ");
        String nome = sc.nextLine();
        System.out.println("Salário: ");
        double salario = sc.nextDouble();
        System.out.printf("O funcionário %s tem um salário de R$%.2f em junho.%n", nome, salario);
        sc.close();
    }
}

// EXERCÍCIO 03 — Nome e salário
// Objetivo: Ler o nome e salário de um funcionário e mostrar uma frase formatada.