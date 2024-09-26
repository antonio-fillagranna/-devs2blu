public class l6array3 {
    public static void main(String[] args) {
		int[] vet = new int[10];
        int somaMenor15 = 0;
        int qntd15 = 0;
		int contador = 0;
        int somaMaior15 = 0;
        System.out.println("Vetor números aleatórios entre 0 e 30 : ");
		for (int i=0;i<vet.length;i++) {
			vet[i]=(int) (Math.random()*31);
			if (vet[i]<15) {
				somaMenor15 += vet[i];
			}if (vet[i]==15){
                qntd15++;
            }else{
                somaMaior15+=vet[i];
                contador++;
            }
		    System.out.print(vet[i]+" ");
		}
    System.out.println();
    int media = somaMaior15/contador;
	System.out.println("a) Soma de elementos < 15 = " + somaMenor15);
    System.out.println("b) Quantidade de elementos iguais a 15 = " + qntd15);
    System.out.println("c) Media dos elementos > 15 = " + media);
	}
}
