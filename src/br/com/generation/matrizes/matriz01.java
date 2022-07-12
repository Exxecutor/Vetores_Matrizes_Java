package br.com.generation.matrizes;

public class matriz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] notasAlunos= new double [2][2];
		notasAlunos[0][0]=9.9;
		notasAlunos[0][1]=8.9;
		
		notasAlunos[1][0]=6.5;
		notasAlunos[1][1]=7.7;
		
		for(int l=0; l<notasAlunos.length;l++) {  //linhas
			for(int c=0;c<notasAlunos[l].length;c++) {    //colunas
					System.out.print(notasAlunos[l][c]+" | ");
				}
			System.out.println();			
			}
		}
	}

