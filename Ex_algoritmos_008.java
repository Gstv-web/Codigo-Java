package br.com.generation.exercicios;

import java.util.Scanner;

/*  O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
	consumidor.*/

public class Ex_algoritmos_008 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valorFabrica, valorImposto, valorDistr;
		
		System.out.println("Digite o valor de f�brica do autom�vel: ");
		valorFabrica = input.nextDouble();
		
		valorImposto = valorFabrica * 0.45;
		valorDistr = valorFabrica * 0.28;
		System.out.println("O valor total do ve�culo � de R$" + (valorFabrica + valorImposto + valorDistr));
		
		input.close();
	}

}
