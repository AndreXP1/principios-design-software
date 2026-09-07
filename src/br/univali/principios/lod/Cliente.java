package br.univali.principios.lod;

public class Cliente {
    private final String nome;
    private final CartaoCredito cartaoCredito;

    public Cliente(String nome, CartaoCredito cartaoCredito) {
        this.nome = nome;
        this.cartaoCredito = cartaoCredito;
    }

    public String getNome() {
        return nome;
    }

    // metodo CartaoCredito para mostrar violação da lei de demeter
    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public boolean realizarPagamento(double valor) { // breakpoint aqui
        System.out.println("  [Cliente] " + nome + " recebendo solicitação de pagamento e acionando o próprio cartão...");
        return this.cartaoCredito.debitar(valor);
    }
}
