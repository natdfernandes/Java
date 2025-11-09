import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.printf("O nome foi: %s", ler_nome());
        } catch (NomeInvalidoException e) {
            System.err.printf(e.getMessage());
            System.out.println("Nome invalido");
        } catch (Exception e) {
            System.out.println("Erro inexperado");
        } finally {
            System.out.println("Fim do programa");
        }
    }

    public static String ler_nome() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        if (nome.trim().equals("")) {
            throw new NomeInvalidoException("Não pode ter valor vazio!!!");
        }

        if(nome.length() <= 3) {
            throw new Exception("Tamanho invalido");
        }

        return nome;
    }
}