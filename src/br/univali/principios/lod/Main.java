package br.univali.principios.lod;

public class Main {

    public static void main(String[] args) {
        System.out.println("DEMONSTRAÇÃO: LAW OF DEMETER (LoD)\n");


        CartaoCredito cartao = new CartaoCredito("4532-XXXX-XXXX-8821", 1000.00);
        Cliente cliente = new Cliente("Ana Silva", cartao);
        Pedido pedido = new Pedido("PED-1092", 250.00, cliente);

        System.out.println("\n--- 1. Cenário de VIOLAÇÃO da Law of Demeter ---\n\n");
        System.out.println("Cadeia de chamadas: pedido.getCliente().getCartaoCredito().debitar()");
        boolean resultadoViolacao = pedido.processarPagamentoComViolacao();
        System.out.println("Resultado do pagamento (Violação): " + (resultadoViolacao ? "SUCESSO" : "FALHA"));

        System.out.println("\n\n--- 2. Cenário de APLICAÇÃO CORRETA da Law of Demeter ---\n\n");
        System.out.println("Chamada direta: pedido.processarPagamentoCorreto() -> cliente.realizarPagamento()");
        boolean resultadoCorreto = pedido.processarPagamentoCorreto();
        System.out.println("Resultado do pagamento (Correto): " + (resultadoCorreto ? "SUCESSO" : "FALHA"));
    }
}
