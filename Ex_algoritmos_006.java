package br.com.generation.exercicios;

import java.util.Scanner;

/*6. Construa um programa em c que, tendo como dados de entrada dois pontos
	 quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
	 que efetua tal cálculo é:*/

public class Ex_algoritmos_006 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double x1, y1, x2, y2;
		double p1, p2;
		double d;
		
		
		System.out.println("Digite x no primeiro ponto: ");
		x1 = input.nextDouble();
		System.out.println("Digite y no primeiro ponto: ");
		y1 = input.nextDouble();
		System.out.println("Digite x no segundo ponto: ");
		x2 = input.nextDouble();
		System.out.println("Digite y no segundo ponto: ");
		y2 = input.nextDouble(); 
		
		p1 = Math.pow((x2 - x1), 2);
		p2 = Math.pow((y2 - y1), 2);
		d = Math.sqrt(p1 + p2);
		
		
		System.out.println("d = " + d);
		
		input.close();
		

	}

}
