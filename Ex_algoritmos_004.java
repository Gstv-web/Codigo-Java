package br.com.generation.exercicios;

import java.util.Scanner;

/*Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
  Calcule a seguinte expressão:*/

public class Ex_algoritmos_004 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		double d, r, s;
		
		System.out.println("Expressão de D");
		System.out.println("Digite o valor de A: ");
		a = input.nextDouble();
		System.out.println("Digite o valor de B: ");
		b = input.nextDouble();
		System.out.println("Digite o valor de C: ");
		c = input.nextDouble();
		
		r = Math.pow((a + 3), 2);
		s = Math.pow((b + c), 2);
		d = (r + s) / 2;
		
		System.out.println("D = " + d);
		
		input.close();
		
	}

}
