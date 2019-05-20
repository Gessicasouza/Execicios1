package com.br.exercicios;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
	/* Ler dois valores inteiros para as variáveis A e B,
	 * efetuar a troca dos valores de modo que a variável A passe a possuir o valor da variável B,
	 * e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
	 */
	  Scanner Input = new Scanner(System.in);	
	  
	  System.out.println("Qual é o Valor de A? ");
      int A = Input.nextInt();
      System.out.println("Qual é o Valor de B? ");
      int B = Input.nextInt();
      
     
      
      System.out.println("O valor de A é = " + A +" "+ "O valor de B é = " + B);

	}

}
