package com.br.exercicios;

import java.util.Scanner;

public class Exercicios5 {

	private static Scanner input;

	public static void main(String[] args) {
		/*Faça um programa que leia um número inteiro e
		 *mostre uma mensagem na tela indicando se este número é positivo ou negativo.
		 *Pare a execução do programa quando o usuário requisitar.
		 */

        input = new Scanner(System.in);
	    
	    System.out.println("Digite um Numero: ");
	    int numero =input.nextInt();
	    
	    if( numero >=0){
	    	System.out.println("Esse numero é Positivo "+numero);
	    	
	    }else{
	    	System.out.println("Esse numero é Negativo "+numero);}
	    
	    for(int controle = 0; controle < numero ; controle ++) {
	    	
	    }
			
		System.out.println("Aperte 0 para Continuar . 1 Para Sair.");
		 
	    
	}
	

}
