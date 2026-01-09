package structural.facade.eloremuneracao.subsistemas;

public class ProcessadorRemuneracao {
    public void creditar(double valor, String tipoCartao) {
        System.out.println("Creditando R$" + valor + " no cartão Elo " + tipoCartao + ".");
    }
}
