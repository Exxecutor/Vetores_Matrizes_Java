package br.com.generatio.vetores;

public class vetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor=new int[10];
		
		vetor[2]=357;
		int numero=157;
		vetor[4]=numero;
		vetor[7]=456;
		
		int valor=vetor[7];
		for(int i=0;i<=9;i++) {
			System.out.println("Posição: "+i+" | "+vetor[i]);
		}
		System.out.println("Valor da variavel com posição de vetor : "+valor);
	}

}
