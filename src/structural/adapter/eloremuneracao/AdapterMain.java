import structural.adapter.eloremuneracao.RemuneracaoInterface;
import structural.adapter.eloremuneracao.adapter.RemuneracaoInterfaceAdapter;
import structural.adapter.eloremuneracao.legado.SistemaLegadoPagamento;
import structural.adapter.eloremuneracao.nativo.RemuneracaoInterfaceElo;

static void main() {
    // Usando remuneração nativa Elo
    RemuneracaoInterface remuneracaoInterfaceElo = new RemuneracaoInterfaceElo();
    remuneracaoInterfaceElo.creditar(600.00);

    // Usando remuneração via sistema legado com Adapter
    SistemaLegadoPagamento legado = new SistemaLegadoPagamento();
    RemuneracaoInterface remuneracaoInterfaceAdaptada = new RemuneracaoInterfaceAdapter(legado, "Conta123");
    remuneracaoInterfaceAdaptada.creditar(800.00);

}

