public class Main {
    public static void main(String[] args) {
        try {
            verificaMaiorDeIdade(18);
            verificaMaiorDeIdade(45);
            verificaMaiorDeIdade(10);
            verificaMaiorDeIdade(-20);
        } catch (IdadeInvalidaException error) {
            System.out.println(error.getMessage());
        }

    }

    private static void verificaMaiorDeIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) {
            throw new IdadeInvalidaException("Essa idade é invalida");
        }
        else if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }
}

class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException(String message) {
        super(message);
    }
}