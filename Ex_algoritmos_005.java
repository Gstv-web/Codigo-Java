package br.com.generation.exercicios;

/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	 aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	 respectivamente.*/

import java.util.Scanner;

public class Ex_algoritmos_005 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("-- An�lise de notas escolares--");
		System.out.println("Digite a primeira nota: ");
		nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = input.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = input.nextDouble();
		
		media = nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.5;
		
		System.out.println("A m�dia �: " + media);
		
		input.close();
		
		
	}
}
