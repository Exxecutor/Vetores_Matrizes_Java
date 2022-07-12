package br.com.generation.listas;

import java.util.Scanner;

public class ex1lista {

	public static void main(String[] args) {
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
				 */
		double soma=0;
		double[] notas=new double[5];
		double num=0;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Insira a nota da prova: ");
		for(int x=0;x<=4;x++) {
			System.out.println(1+x+" valor:");
			notas[x]=entrada.nextDouble();
			soma=soma+notas[x];
			if(notas[x]>num){
				num=notas[x];
			}
		}
		
		for(int x=0;x<=4;x++) {
			System.out.print(notas[x]+" | ");
			
		}
		System.out.println("O maior valor é "+num);
	}

}
