package br.com.exemplo.factory;

import br.com.exemplo.model.*;

public class PagamentoBitcoinFactory extends PagamentoFactory {
    @Override
    public Pagamento criarPagamento() {
        return new PagamentoBitcoin();
    }
}