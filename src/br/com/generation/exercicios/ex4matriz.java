package br.com.generation.listas;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
		 */
			int[][] matriz=new int[3][3];
			int soma=0,somad;
			Scanner entrada= new Scanner(System.in);
			for(int l=0;l<=2;l++) {
				for(int c=0;c<=2;c++) {
					System.out.println("Digite ["+l+"] ["+c+"] :");
					matriz[l][c]=entrada.nextInt();
					soma=soma+matriz[l][c];
				}
			}
			somad=matriz[0][0]+matriz[1][1]+matriz[2][2];
			System.out.println("A soma total da matriz é: "+soma);
			System.out.println("A soma total da matriz na diagonal é: "+somad);
			
	}

}
