package passo01_sequenciasBasicas;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = sc.nextLine();
        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        sc.close();
    }
}

// EXERCÍCIO 02 — Boas-vindas com nome
// Objetivo: Perguntar o nome da pessoa e mostrar uma mensagem de boas-vindas.
