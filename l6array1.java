public class l6array1 {

	public static void main(String[] args) {
		int[] vet = new int[10];
		int somaImpares=0;
		int qntdImpares=0;
		for (int i=0;i<vet.length;i++) {
			vet[i]=(int) (Math.random()*101);
			if (vet[i]%2==1) {
				somaImpares+=vet[i];
				qntdImpares+=1;
			}
		System.out.println("Elemento " + i + "do array: " + vet[i]);
		}
	double mediaimpares = somaImpares/qntdImpares;
	System.out.println("média dos impares = " + mediaimpares);
	}
}