package br.com.generation.exercicios;

/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
	 expressa em anos, meses e dias.*/

import java.util.Scanner;

public class Ex_algoritmos_002 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int dias = 0, restoDias, meses, anos;
		
		System.out.println("Digite sua idade em dias: ");
		dias = input.nextInt();
		
		meses = dias / 30;
		anos = dias / 365;
		restoDias = dias % 30;
		
		System.out.println("Sua idade em dias equivale à " + anos + " anos, " + meses + " meses e " + restoDias + " dias.");
		
		input.close();
	
		
	}

}
