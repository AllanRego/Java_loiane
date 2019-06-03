package br.ufrn.imd.java.ExVetores;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o elemto da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		System.out.println("Elementos do vetor A: ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println("Elemtos do vetor B: ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		scan.close();
	}
}
