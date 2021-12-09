package br.com.generation.exercicios;

import java.util.Scanner;

/*  O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
	percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
	consumidor.*/

public class Ex_algoritmos_008 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valorFabrica, valorImposto, valorDistr;
		
		System.out.println("Digite o valor de fábrica do automóvel: ");
		valorFabrica = input.nextDouble();
		
		valorImposto = valorFabrica * 0.45;
		valorDistr = valorFabrica * 0.28;
		System.out.println("O valor total do veículo é de R$" + (valorFabrica + valorImposto + valorDistr));
		
		input.close();
	}

}
