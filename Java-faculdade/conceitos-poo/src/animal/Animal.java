package animal;

public class Animal {
    public String raca;
    public float peso;
    public float altura;
    public String pelagem;

    public void fazerSom() {
        System.out.println("Som do animal da raça: " + raca);
    }

    public void exibirDetalhes() {
        System.out.println("Raça: " +  raca);
        System.out.println("Peso: " +  peso + "Kg");
        System.out.println("Altura: " +  altura + "cm");
        System.out.println("Pelagem: " +  pelagem);
    }
}
