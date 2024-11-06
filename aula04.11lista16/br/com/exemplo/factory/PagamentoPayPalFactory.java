package br.com.exemplo.factory;

import br.com.exemplo.model.*;

public class PagamentoPayPalFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPaypal();
    }
}