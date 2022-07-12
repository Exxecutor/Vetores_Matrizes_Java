package br.com.generation.listas;

import java.util.Scanner;

public class ex3 {
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.

Foi mal escrito mas está funcional
	 */

	public static void main(String[] args) {
		int[][] N1=new int[4][6];
		int[][] N2=new int[4][6];
		int[][] M1=new int[4][6];
		int[][] M2=new int[4][6];
		int l,c;
		Scanner entrada= new Scanner(System.in);
		for(l=0;l<=3;l++) {
			for(c=0;c<=5;c++) {
			System.out.print("Digite N1 ["+l+"]  ["+c+"].");
			N1[l][c]=entrada.nextInt();
			System.out.print("Digite N2 ["+l+"]  ["+c+"].");
			N2[l][c]=entrada.nextInt();
			M1[l][c] = N1[l][c] + N2[l][c];
			M2[l][c] = N1[l][c] - N2[l][c];
		}

	}
		for(l=0;l<=3;l++) {
			for(c=0;c<=5;c++) {
				System.out.print(M1[l][c]+" | ");
				
			}
			System.out.println(" ");
			
		}
		System.out.println(" ");
		for(l=0;l<=3;l++) {
			for(c = 0; c <= 5; c++){
			System.out.print(M2[l][c]+" | ");
		}
		System.out.println(" ");
		}
	}
}
