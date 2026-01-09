package structural.adapter.eloremuneracao.legado;

// Sistema externo legado (interface incompatível)
public class SistemaLegadoPagamento {
    public void realizarPagamento(String conta, double quantia) {
        System.out.println("Pagamento de R$" + quantia + " realizado para conta " + conta + " no sistema legado.");
    }
}
