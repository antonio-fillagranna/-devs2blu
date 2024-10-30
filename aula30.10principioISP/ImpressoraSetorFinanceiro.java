package listaexercicios14.principioISP;

public class ImpressoraSetorFinanceiro implements ImpressoraTexto , ImpressoraRelatorioFinanceiro {

	@Override
	public void imprimirRelatorioFinanceiro() {
		System.out.println("Imprimindo DRE");		
	}

	@Override
	public void imprimirTexto() {
		System.out.println("Imprimindo outros arquivos pro departamento financeiro");		
	}

}
