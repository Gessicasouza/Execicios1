package com.br.exercicios;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
	/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
	 * meses e dias e escreva a idade dessa pessoa expressa apenas em dias. 
	 * Considerar ano com 365 dias e mês com 30 dias.
	 */
     
		Scanner Input = new Scanner(System.in);
	    
	    System.out.println("Qual é a sua Idade? ");
	    int idade =Input.nextInt();
	    
	    int ano = 365;
        int mes = 30;
        
        idade= mes * ano;
        
		System.out.println("Sua Idade é composta de "  + idade +" "+ "Dias."); 
		 
	}

}
