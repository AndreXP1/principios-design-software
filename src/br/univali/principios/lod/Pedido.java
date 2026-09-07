package br.univali.principios.lod;

public class Pedido {
    private final String idPedido;
    private final double valorTotal;
    private final Cliente cliente;

    public Pedido(String idPedido, double valorTotal, Cliente cliente) {
        this.idPedido = idPedido;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
    }

    // violando a lei de demeter
    public boolean processarPagamentoComViolacao() { // add breakpoint linha 15
        System.out.println("[Pedido] Executando chamada violando a LoD: pedido.getCliente().getCartaoCredito().debitar(...)");
        return this.cliente.getCartaoCredito().debitar(this.valorTotal);
    }

    // sem violacao da lei de demeter
    public boolean processarPagamentoCorreto() { // add breakpoint linha 21
        System.out.println("[Pedido] Executando chamada respeitando a LoD: pedido.processarPagamentoCorreto()");
        return this.cliente.realizarPagamento(this.valorTotal);
    }

    public String getIdPedido() {
        return idPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}