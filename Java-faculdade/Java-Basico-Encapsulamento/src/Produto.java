public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    // getters retorna o mesmo tipo ou classe do atributo em questão
    // setters não retona, mas recebem um parametro do mesmo tipo do atributo em questão
    // ambos tem um prefixo seguido do nome do atributo com a primeira letra em maiusculo
    // Exemplo -> titular (getTitular, setTitular)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= -1) {
            System.out.println("Preço inválido!");
        } else {
            System.out.println("Preço aceito!");
            this.preco = preco;
        }
    }

    public int getEstoque() {
        return estoque;
    }

    public void adicionarEstoque() {
        estoque = estoque + 1;
    }

    public void removerEstoque() {
        estoque = estoque - 1;
    }

    public void exibirProduto() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Estoque: " + this.estoque);
    }
}

