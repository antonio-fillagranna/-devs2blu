package EX1;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Produto banana = new Produto("Alimento",5.99);
		Produto microondas = new Produto("EletroDomestico", 499.99);
		Produto celular = new Produto("Eletronico", 1400.00);
		Produto moletom = new Produto("Roupa", 129.50);
		Produto tenis = new Produto("Calçado", 299.25);
		
		Desconto d1 = new DescontoAlimento();
		Desconto d2 = new DescontoEletroDomestico();
		Desconto d3 = new DescontoEletronico();
		Desconto d4 = new DescontoRoupa();
		Desconto d5 = new Descontoxxxx();
			
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(banana);
		produtos.add(microondas);
		produtos.add(celular);
		produtos.add(moletom);
		produtos.add(tenis);
		
		List<Desconto> descontos = new ArrayList<Desconto>();
		descontos.add(d1);
		descontos.add(d2);
		descontos.add(d3);
		descontos.add(d4);
		descontos.add(d5);
		
		CalculadoraDesconto cd = new CalculadoraDesconto();
		cd.calcularDescontoTotal(produtos, descontos);
		
		
	}

}
