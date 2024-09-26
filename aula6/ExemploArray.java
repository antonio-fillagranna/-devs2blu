package ExerciciosPraticaArrays;
public class ExemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] valores = new double[6]; // Apos executada essa instrucao, terei essa 
										 //estrutura criada na memoria, porem vazia. 
		
		//Preenchendo o array individual:
		valores[0] = 5.0;
		valores[1] = 4.8;
		valores[2] = 7.9;
		valores[3] = 4.2;
		valores[4] = 6.4;
		valores[5] = 3.5;
		//outra forma  seria pedir ao usuario para entrar com os dados e ir
		//preenchendo as posicoes do array. Ou ainda usar um laço for para preencher.
		
		//Acessando elementos do array. Acessando seu quinto elemento (numero de posiï¿½ï¿½o 4)
		System.out.println("Elemento 5 do array: " + valores[4]);
		
		//verificando o tamanho do array
		System.out.println("tamanho do array: " + valores.length);
		
		
		//Alterando o valor de sua posicao no array
		valores[0] = 6.8;
		valores[4] = 1.1;
		
		//Acessando os  elementos alterados. Acessando seu quinto elemento (numero de posiï¿½ï¿½o 4)
		System.out.println("Posicao 0 alterada para: " + valores[0]);
		System.out.println("Posicao 4 alterada para: " + valores[4]);
		
		//Mostrar todos os elementos do array
		for( int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		
		//Somar os elementos do array
		double total = 0;
		for( int i = 0; i < valores.length; i++) { // versao padrao para percorrer um array
			total += valores[i];
		}
		System.out.println("O total ï¿½" + total);
	
		
		// lista de inicializacao
		int[] numeros = { 45, 85, 56, 89, 23, 41 , 12, 90};
		//verificando o tamanho do array
		System.out.println("tamanho do array: " + numeros.length);
		
		for(double elemento: numeros) { // outra forma de Mostrar todos os elementos do array
			System.out.println(elemento);
		}


	}

}
