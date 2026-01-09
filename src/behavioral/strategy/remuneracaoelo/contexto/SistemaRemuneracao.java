package behavioral.strategy.remuneracaoelo.contexto;

import behavioral.strategy.remuneracaoelo.EstrategiaRemuneracaoStrategy;

public class SistemaRemuneracao {
    private EstrategiaRemuneracaoStrategy estrategia;

    // Permite trocar a estratégia em tempo de execução
    public void setEstrategia(EstrategiaRemuneracaoStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void executar(double valor) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia definida!");
        } else {
            estrategia.processar(valor);
        }
    }
}

