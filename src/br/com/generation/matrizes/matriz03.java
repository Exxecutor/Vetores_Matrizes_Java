package br.com.generation.matrizes;

import java.util.Scanner;

public class Matriz01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double[][] notasAlunos = new double[2][2];
		double soma = 0.0, media = 0.0;
		
		for(int l = 0; l < notasAlunos.length; l++) {//linhas
			//soma = 0.0;
			for(int c = 0; c < notasAlunos[l].length; c++) {//colunas
				System.out.printf("Nota na posição [%d][%d]: " , l,c);
				notasAlunos[l][c] = entrada.nextDouble();
				soma += notasAlunos[l][c];
				media = soma / (notasAlunos.length + notasAlunos[l].length);
			}
		}
		System.out.println();
		//Visualização da Matriz....
		for(int l = 0; l < notasAlunos.length; l++) {//linhas
			for(int c = 0; c < notasAlunos[l].length; c++) {//colunas
					System.out.print(notasAlunos[l][c] + " | ");					
				}
			System.out.println();
		}	
		System.out.println();
		System.out.println("Média Geral dos Alunos: " + media);
		entrada.close();
	}
}

