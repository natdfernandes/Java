package animal;

public class Canino extends Animal {
    private String tipoDeOrelha;
    private String ambiente;

    @Override
    public void fazerSom() {
        System.out.println("Latir e uivar");
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo de orelha:" + tipoDeOrelha);
        System.out.println("Ambiente:" +  ambiente);
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTipoDeOrelha() {
        return tipoDeOrelha;
    }

    public void setTipoDeOrelha(String tipoDeOrelha) {
        this.tipoDeOrelha = tipoDeOrelha;
    }
}
