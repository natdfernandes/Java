public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirExtrato() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Saldo da conta: " + this.saldo);
    }
}
