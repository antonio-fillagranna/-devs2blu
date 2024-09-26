public class l6array2 {
	public static void main(String[] args) {
		int[] vet = new int[10];
		int contador = 0;
        System.out.println("Vetor de idades gerado aleatoriamente : ");
		for (int i=0;i<vet.length;i++) {
			vet[i]=(int) (Math.random()*101);
			if (vet[i]>35) {
				contador++;
			}
		System.out.print(vet[i]+" ");
		}
	System.out.println("Quantidade de idades acima de 35 = " + contador);
	}
}