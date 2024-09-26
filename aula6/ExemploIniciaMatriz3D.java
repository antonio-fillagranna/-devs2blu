package ExerciciosPraticaMatrizes;

public class ExemploIniciaMatriz3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EXEMPLO 1
		int[][][] matriz3D = new int[3][3][3];
		
		
		int valor = 1;
		for (int i = 0; i < matriz3D.length; i++) {	
			for (int j = 0; j < matriz3D[i].length; j++) {       
				for (int k = 0; k < matriz3D[i][j].length; k++) {            				
					matriz3D[i][j][k] = valor++; 
					System.out.print(matriz3D[i][j][k] + " "); 
				}
				 System.out.println();
			}
			System.out.println();
		}


		// EXEMPLO 2
//		int[][][] threeDimArr = new int[2][][];//Criar uma matriz tridimensional
//		
//		threeDimArr[0] = new int[4][5];//Criar o primeiro array bidimensional
//		threeDimArr[1] = new int[2][1];//Criar o segundo array bidimensional:
//
//		int valor = 1;
//		for (int i = 0; i < threeDimArr.length; i++) {	
//			for (int j = 0; j < threeDimArr[i].length; j++) {       
//				for (int k = 0; k < threeDimArr[i][j].length; k++) {            				
//					threeDimArr[i][j][k] = valor++; 
//					System.out.print(threeDimArr[i][j][k] + " "); 
//				}
//				 System.out.println();
//			}
//			System.out.println();
//		}


	}

}
