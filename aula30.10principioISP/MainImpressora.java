package listaexercicios14.principioISP;

public class MainImpressora {

	public static void main(String[] args) {
		ImpressoraBasica i1 = new ImpressoraBasica();
		ImpressoraSetorFinanceiro i2 = new ImpressoraSetorFinanceiro();
		ImpressoraTonner i3 = new ImpressoraTonner();
		i1.imprimirTexto();
		i2.imprimirTexto();
		i2.imprimirRelatorioFinanceiro();
		i3.imprimirImagem();
		
	}

}
