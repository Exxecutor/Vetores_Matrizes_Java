package br.com.generatio.vetores;

import java.util.Scanner;

public class vetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		
		String[] nomes=new String[2];
		double[] notas=new double[2];
		double soma =0.0, media=0.0;
		System.out.println("Digite as 4 notas do aluno: ");
		for(int i=0;i<nomes.length && i<notas.length;i++) {
			System.out.println("Nome do aluno");
			nomes[i]=entrada.next();
			entrada.nextLine();
			System.out.println("Nota do aluno:");
			notas[i]=entrada.nextDouble();
		}
		for(int i=0;i<nomes.length && i<notas.length;i++) {
			System.out.println("Aluno: "+nomes[i]+"      -->Nota: "+notas[i]);
		}
	}

}
