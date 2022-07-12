package br.com.generation.listas;

import java.util.Scanner;

public class ex2lista {

	public static void main(String[] args) {
		/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação..*/
		double soma=0;
		int[] dado=new int[10];
		int num=0;
		int quant=0;
		int med=0;
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Escreva o valor do dado");
		for(int x=0;x<=9;x++) {
			System.out.println(1+x+" valor: ");
			dado[x]=entrada.nextInt();
			soma=soma+dado[x];
			med++;
			if(dado[x]>num) {
				num=dado[x];
			}
				
		}
		for(int x=0;x<=9;x++) {
			System.out.print(dado[x]+" | ");
			
		}
		for(int x=0;x<=9;x++) {
			if(dado[x]==num) {
				quant++;
			}
			
		}
		soma=soma/med;
		System.out.println("  ");
		System.out.println("A média é "+soma);
		System.out.println("O maior valor é "+num);
		System.out.println("Ele aparece "+quant+" vezes");
		

	}

}
