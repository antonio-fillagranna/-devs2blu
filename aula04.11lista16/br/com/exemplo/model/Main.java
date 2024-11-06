package br.com.exemplo.model;

import br.com.exemplo.factory.*;

public class Main {
    public static void main(String[] args) {
        PagamentoFactory bitcoinFactory = new PagamentoBitcoinFactory();
        Pagamento pgtoBitcoin = bitcoinFactory.criarPagamento();
        pgtoBitcoin.processarPagamento();

        PagamentoFactory cartaoCreditoFactory = new PagamentoCartaoDeCreditoFactory();
        Pagamento pgtoCartaoCredito = cartaoCreditoFactory.criarPagamento();
        pgtoCartaoCredito.processarPagamento();

        PagamentoFactory paypalFactory = new PagamentoPayPalFactory();
        Pagamento pgtoPaypal = paypalFactory.criarPagamento();
        pgtoPaypal.processarPagamento();
    }
}