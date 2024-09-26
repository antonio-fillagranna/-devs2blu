package ExerciciosPraticaMatrizes;

import java.util.Scanner;

public class ExemploMatrizInicializadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int[] [] Matriz1 = {{1, 2, 3},{4, 5, 6}}; // INICIALIZADORES ANINHADOS
		
		 // INICIALIZADORES ANINHADOS COM TAMANHO DE COLUNAS DIFERENTES
		int[] [] Matriz2 = { {1,2},{ 3 },{4, 5, 6},{12,34,2,10,8}};// M[4][5]
		
		
		System.out.println("TAMANHO MATRIZ1: " + Matriz1.length );
		System.out.println("VALORES DA MATRIZ1 POR LINHA SÃO: " );
		for(int LINHA = 0; LINHA < Matriz1.length; LINHA++) {
			
			for(int COLUNA = 0; COLUNA < Matriz1[LINHA].length; COLUNA++) 
				System.out.printf(" " + Matriz1[LINHA][COLUNA]);
			
			System.out.println();		
		}
		
		System.out.println("TAMANHO MATRIZ2: " + Matriz2.length );
		System.out.println("VALORES DA Matriz2 POR LINHA S�O: " );
		for(int LINHA = 0; LINHA < Matriz2.length; LINHA++) {
			
			for(int COLUNA = 0; COLUNA < Matriz2[LINHA].length; COLUNA++) 
				System.out.printf(Matriz2[LINHA][COLUNA]+ "\t");
			
			System.out.println();
			
		//	System.out.println(Matriz2[LINHA][COLUNA].length());	
		}
		
		
		
		//AlTERANDO AS COLUNA DA MATRIZ
//		int [ ] [ ]  b  =   new int[ 2 ] [  ]; //cria duas linhas 
//		System.out.println("Tamanho de linhas ARRAY B: " + b.length);
//		b[ 0 ] = new int[5]; //cria 5 colunas para linha 0.
//		System.out.println("Tamanho de colunas na posi��o 0 do array B: " + b[0].length);
//		b[ 1 ]  = new int[3]; //cria 3 colunas para a linha1. 
//		System.out.println("Tamanho de colunas na posi��o 1 do array B: " + b[1].length);
//		
//		for(int COLUNA = 0; COLUNA < b[0].length; COLUNA++) {
//			System.out.println("ENTRE COM O VALOR DA POSICAO DE B[0] " +COLUNA);
//			b[0][COLUNA] = scan.nextInt();
//		}
//		System.out.println("Tamanho array B: " + b.length);	
//		for(int COLUNA = 0; COLUNA < b[0].length; COLUNA++) {
//			System.out.printf(" " + b[0][COLUNA]);	
//		}
//		
//		System.out.println();		
//
//		for(int COLUNA = 0; COLUNA < b[1].length; COLUNA++) {
//			System.out.println("ENTRE COM O VALOR DA POSICAO DE B[1] " +COLUNA);
//			b[1][COLUNA] = scan.nextInt();
//		}
//			System.out.println("Tamanho array B: " + b.length);	
//		for(int COLUNA = 0; COLUNA < b[1].length; COLUNA++) {
//			System.out.printf(" " + b[1][COLUNA]);	
//		}
//			
//			System.out.println();	

	}

}
