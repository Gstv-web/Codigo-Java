package br.com.generation.exercicios;

import java.util.Scanner;

public class Ex_algoritmos_007 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int a, b, c, d, e, f, x, y;

	
		System.out.println("Digite o valor de A: ");
		a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		b = input.nextInt();
		System.out.println("Digite o valor de C: ");
		c = input.nextInt();
		System.out.println("Digite o valor de D: ");
		d = input.nextInt();
		System.out.println("Digite o valor de E: ");
		e = input.nextInt();
		System.out.println("Digite o valor de F: ");
		f = input.nextInt();
		
		x = ((c * e) - (b * f) / (a * e) - (b * d));
		y = ((a * f) - (c * d) / (a * e) - (b * d));
		
		System.out.println("A equação x é igual a " + x);
		System.out.println("A equação y é igual a " + y);
		
		input.close();
	
	}

}
