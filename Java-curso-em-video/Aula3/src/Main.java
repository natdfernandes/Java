//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
       // c1.ponta = 0.5;
        c1.caraga = 80;
       // c1.tampada = true;
        c1.destampar();
        c1.status();
    }
}