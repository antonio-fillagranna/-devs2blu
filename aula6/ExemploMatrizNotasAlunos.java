package ExerciciosPraticaMatrizes;

public class ExemploMatrizNotasAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] []  notasAlunos  =  new double[3][4]; // Declaracao da Matriz array bidimensional 
														
		
		
		//Atribuicao dos valores na Matriz
		//LINHA 0
		notasAlunos[0] [0] = 10;
		notasAlunos[0] [1] = 7;
		notasAlunos[0] [2] = 8;
		notasAlunos[0] [3] = 9.5;
		//LINHA 1
		notasAlunos[1] [0] = 9;
		notasAlunos[1] [1] = 8;
		notasAlunos[1] [2] = 7;
		notasAlunos[1] [3] = 9;
		//LINHA 2
		notasAlunos[2] [0] = 8;
		notasAlunos[2] [1] = 9;
		notasAlunos[2] [2] = 10;
		notasAlunos[2] [3] = 7;
		
		//MOSTRANDO OS ELEMEMNTOS DA MATRIZ
		for(int LINHA = 0; LINHA < notasAlunos.length; LINHA++) { // FORMA COM OS INDICES 
																  //NOMEADOS 
																  //PARA LINHA E COLUNA
			
			for(int COLUNA = 0; COLUNA < notasAlunos[LINHA].length; COLUNA++) 
				System.out.printf(" " + notasAlunos[LINHA][COLUNA]);
			
			System.out.println();		
		}
		
	
		System.out.println();
		
		
		
		
		
		// ALTERANDO VALOR NA MATRIZ
		notasAlunos[1][3] = 8;
		for(int i = 0; i < notasAlunos.length; i++) {
			
			for(int j = 0; j < notasAlunos[i].length; j++) 
				System.out.printf(" " + notasAlunos[i][j] + " - ");
			
			System.out.println();	
			
		}
		
		System.out.println();	
		
		 //SOMANDO AS NOTAS DE CADA ALUNO
		double soma;
		for(int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for(int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
				//System.out.println();
			}
				
			System.out.printf("SOMA DAS NOTAS DO ALUNO DA LINHA: " + i + " " + soma );
			System.out.println();		
		}
	
		
	}

}
