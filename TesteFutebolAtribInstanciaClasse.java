package exerciciospratica.atributosinstanciaclasse;

import java.util.Scanner;


public class TesteFutebolAtribInstanciaClasse {

	public static void main(String[] args) {
	
		String time;
		String selecao;
		FutebolAtribInstanciaClasse torcida =new FutebolAtribInstanciaClasse();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Para qual time voce torce? ");
		time = scan.next();
		System.out.println(" Para qual Selecao voceflu torce? ");
		selecao = scan.next();
		
		System.out.println(" INSTANCIA 1 ");
		torcida.setNomeTime(time);
		torcida.setNomeSelecao(selecao);
		torcida.mostrarTime();
		torcida.mostrarSelecao();
		
		FutebolAtribInstanciaClasse torcida2 = new FutebolAtribInstanciaClasse();
		System.out.println(" INSTANCIA 2 ");
		torcida2.mostrarTime();
		torcida2.mostrarSelecao();
		//torcida2.setNomeSelecao("Italiana");
		//torcida.mostrarSelecao();
		//selecao = FutebolAtribInstanciaClasse.nomeSelecao;
		
		FutebolAtribInstanciaClasse torcida3 = new FutebolAtribInstanciaClasse();
		System.out.println(" INSTANCIA 3 ");
		torcida2.mostrarTime();
		torcida2.mostrarSelecao();
	
	}

}
