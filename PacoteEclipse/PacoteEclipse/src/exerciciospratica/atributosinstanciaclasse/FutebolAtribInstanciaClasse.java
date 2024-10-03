package exerciciospratica.atributosinstanciaclasse;

public class FutebolAtribInstanciaClasse {
	 private String nomeTime; // var de instancia
	 private static String  nomeSelecao; // var de classe
	

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public String getNomeSelecao() {
		return nomeSelecao;
	}

	public void setNomeSelecao(String nomeSelecao) {
		this.nomeSelecao = nomeSelecao;
	}
	
	public void  mostrarTime() {
		System.out.println(" Seu time do coracao e"+ getNomeTime());
	}
	
	public void  mostrarSelecao() {
		System.out.println(" Sua Selecao es "+ getNomeSelecao());
	}
}
