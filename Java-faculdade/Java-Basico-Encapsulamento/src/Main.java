public class Main {
    public static void main(String[] args) {
        /*System.out.println("Conta Bancária (Setor Financeiro)");
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setTitular("Luna");
        contaBancaria.setNumeroConta("2025");
        contaBancaria.depositar(10);
        contaBancaria.sacar(9);
        contaBancaria.depositar(contaBancaria.getSaldo()*2);
        contaBancaria.exibirExtrato();*/

        System.out.println("Produto (Setor Varejo)");
        Produto produto = new Produto();
        produto.setNome("Notebook");
        produto.setPreco(2500);
        produto.adicionarEstoque();
        produto.exibirProduto();
    }
}