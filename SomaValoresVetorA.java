package com.vitorcamara.projetos;

import java.util.Scanner;

public class SomaValoresVetorA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do index " + i + ":");
			vetorA[i] = scan.nextInt();

			soma += vetorA[i]; // 'soma' recebe a soma de todos os valores armazenados nos índices do vetorA
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("index " + i + ": " + vetorA[i]);
		}

		System.out.println("Valor da soma dos index do Vetor A = " + soma);

	}

}
