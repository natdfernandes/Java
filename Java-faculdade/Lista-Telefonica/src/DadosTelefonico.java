public class DadosTelefonico {
    private int id;
    private String nome;
    private int telefone;

    public DadosTelefonico() {

    }

    public DadosTelefonico(int id, String nome, int telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "DadosTelefonico{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
