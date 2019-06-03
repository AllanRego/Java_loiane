package br.ufrn.imd.java.ExVetores;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o valor da posição" + i + "Para A: ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("digite o Valor da posição " + i + "Para B: ");
			vetorB[i] = scan.nextInt();
		}
		
		
	}

}
