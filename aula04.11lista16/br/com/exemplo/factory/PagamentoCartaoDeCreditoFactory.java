package br.com.exemplo.factory;

import br.com.exemplo.model.*;

public class PagamentoCartaoDeCreditoFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoCartaoDeCredito();
    }
}