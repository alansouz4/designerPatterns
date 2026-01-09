package structural.adapter.eloremuneracao.adapter;

import structural.adapter.eloremuneracao.RemuneracaoInterface;
import structural.adapter.eloremuneracao.legado.SistemaLegadoPagamento;

public class RemuneracaoInterfaceAdapter implements RemuneracaoInterface {
    private SistemaLegadoPagamento sistemaLegado;
    private String contaDestino;

    public RemuneracaoInterfaceAdapter(SistemaLegadoPagamento sistemaLegado, String contaDestino) {
        this.sistemaLegado = sistemaLegado;
        this.contaDestino = contaDestino;
    }

    @Override
    public void creditar(double valor) {
        // Traduz a chamada para o formato do sistema legado
        sistemaLegado.realizarPagamento(contaDestino, valor);
    }
}

