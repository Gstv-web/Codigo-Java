package br.com.generation.exercicios;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
	 expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/


public class Ex_algoritmos_003 {

	public static void main(String[] args) {
		
		int segundos = 0, horas, minutos, restoSegundos;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o tempo em segundos: ");
		segundos = input.nextInt();
		
		horas = segundos / 3600;
		minutos = segundos / 60;
		restoSegundos = segundos % 60;
		
		System.out.println("O tempo digitado equivale à " + horas + "hora, " + minutos +  "minuto(s)  e " + restoSegundos + " segundos.");
		
		input.close();
		

	}

}
