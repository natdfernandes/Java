import java.util.List;

public interface ListaTelefonico {
    public void salvar(DadosTelefonico dadosTelefonico);

    public List<DadosTelefonico> buscarListaTelefonica();

    public void apagar(int id);
}
