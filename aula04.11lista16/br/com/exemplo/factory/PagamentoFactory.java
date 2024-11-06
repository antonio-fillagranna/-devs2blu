package br.com.exemplo.factory;

import br.com.exemplo.model.*;

public abstract class PagamentoFactory {
    public abstract Pagamento criarPagamento();
}