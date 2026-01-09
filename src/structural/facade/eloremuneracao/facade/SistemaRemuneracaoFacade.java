package structural.facade.eloremuneracao.facade;

import structural.facade.eloremuneracao.subsistemas.NotificacaoCliente;
import structural.facade.eloremuneracao.subsistemas.ProcessadorRemuneracao;
import structural.facade.eloremuneracao.subsistemas.RegistroTransacao;
import structural.facade.eloremuneracao.subsistemas.ValidadorCartao;

public class SistemaRemuneracaoFacade {
    private ValidadorCartao validador;
    private ProcessadorRemuneracao processador;
    private RegistroTransacao registro;
    private NotificacaoCliente notificacao;

    public SistemaRemuneracaoFacade() {
        this.validador = new ValidadorCartao();
        this.processador = new ProcessadorRemuneracao();
        this.registro = new RegistroTransacao();
        this.notificacao = new NotificacaoCliente();
    }

    public void remunerarCliente(String tipoCartao, double valor) {
        validador.validar(tipoCartao);
        processador.creditar(valor, tipoCartao);
        registro.registrar(tipoCartao, valor);
        notificacao.enviar("Você recebeu R$" + valor + " no cartão Elo " + tipoCartao + ".");
    }
}
