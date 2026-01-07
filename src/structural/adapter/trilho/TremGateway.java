package structural.adapter.trilho;

// classe contrato responsavel por abstrair logica do trilho
// onde a classe de servico nao precisar saber oq que a classe trilho faz
public interface TremGateway {
    void ande();
}
