package com.br.exercicios;

import java.util.Scanner;

public class Exercicios3 {

	public static void main(String[] args) {
	/*Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
	 * 
	 */
	Scanner Input = new Scanner(System.in);
	System.out.println("Digite um Numero:");
	int numero = Input.nextInt();
	
	if(numero >=0){
		System.out.println("Esse Numero é Possitivo "+ numero);
	}else {
		System.out.println("Esse Numero é Negativo" + numero);
	}
	
	
	
	

	

	}

}
