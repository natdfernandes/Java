import java.util.Scanner;

public class Main {
    static ListaTelefonico listaTelefonico = new ListaTelefonicoEmMemoria();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("Lista Telefonica:");
            System.out.println("1 - Salvar Item");
            System.out.println("2 - Exibir Itens");
            System.out.println("3 - Apagar Item");
            System.out.println("0 - Sair");
            System.out.println("\nDigite a opção desejada:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerenciarNovoDadosTelefonico();
                    break;
                case 2:
                    exibirListaTelefonica();
                    break;
                case 3:
                    apagarDaListaTelefonica();
            }

        } while (opcao != 0);
    }

    private static void apagarDaListaTelefonica() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o id desejado para apagar:");
        int id = scanner.nextInt();

        listaTelefonico.apagar(id);
    }

    private static void exibirListaTelefonica() {
        for (DadosTelefonico dadosTelefonico : listaTelefonico.buscarListaTelefonica()) {
            System.out.println(dadosTelefonico.toString());
        }
    }

    private static void gerenciarNovoDadosTelefonico() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o telefone:");
        int telefone = scanner.nextInt();

        int id = listaTelefonico.buscarListaTelefonica().size() + 1;

        DadosTelefonico novoDadosTelefonico = new DadosTelefonico(id, nome, telefone);
        listaTelefonico.salvar(novoDadosTelefonico);
    }
}