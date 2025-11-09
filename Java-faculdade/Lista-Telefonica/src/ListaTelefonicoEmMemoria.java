import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListaTelefonicoEmMemoria implements ListaTelefonico {
    private final List<DadosTelefonico> dadosTelefonicos = new ArrayList<>();

    @Override
    public void salvar(DadosTelefonico dadosTelefonico) {
        dadosTelefonicos.add(dadosTelefonico);
    }

    @Override
    public List<DadosTelefonico> buscarListaTelefonica() {
        return dadosTelefonicos;
    }

    @Override
    public void apagar(int id) {
        Optional<DadosTelefonico> dadosTelefonicoEncontrado = dadosTelefonicos.stream().filter(dadosTelefonico -> dadosTelefonico.getId() == id).findFirst();
        if (dadosTelefonicoEncontrado.isEmpty()) {
            System.out.println("Não existe!");
            return;
        }

        dadosTelefonicos.removeIf(dadosTelefonico -> dadosTelefonico.getId() == id);
    }
}
