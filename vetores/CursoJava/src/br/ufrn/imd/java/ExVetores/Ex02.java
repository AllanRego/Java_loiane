package br.ufrn.imd.java.ExVetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posição " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0;i<vetorA.length;i++) {
			vetorB[i] = vetorA[i]*2;
		}
		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " "); 
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		
		
		scan.close();
	}

}
