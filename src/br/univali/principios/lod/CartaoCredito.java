package br.univali.principios.lod;

public class CartaoCredito {
    private final String numero;
    private double limiteDisponivel;

    public CartaoCredito(String numero, double limiteDisponivel) {
        this.numero = numero;
        this.limiteDisponivel = limiteDisponivel;
    }

    public boolean debitar(double valor) { // breakpoint aqui
        if (this.limiteDisponivel >= valor) {
            this.limiteDisponivel -= valor;
            System.out.println("   [CartaoCredito] Débito de R$ " + valor + " aprovado no cartão " + numero);
            System.out.println("   [CartaoCredito] Novo limite disponível: R$ " + limiteDisponivel);
            return true;
        }
        System.out.println("   [CartaoCredito] Débito recusado. Limite insuficiente no cartão " + numero);
        return false;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }
}