package br.com.generation.exercicios;

import java.util.Scanner;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	 dias e mostre-a expressa apenas em dias.*/


public class Ex_algoritmos_001 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		short diasAno = 365;
		short diasMes = 30;
		short anos = 0, meses = 0, dias = 0;
		int idade;
		
		System.out.println("Informe sua idade em: \n");
		System.out.println("\nAnos: ");
		anos = input.nextShort();
		System.out.println("\nMeses: ");
		meses = input.nextShort();
		System.out.println("\nDias: ");
		dias = input.nextShort();
		
		idade = dias + (anos * diasAno) + (meses * diasMes);
		
		System.out.println("A sua idade em dias equivalem a " + idade + " dias.");
		
		
		input.close();
	}

}
