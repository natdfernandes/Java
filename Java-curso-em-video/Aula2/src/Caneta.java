
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int caraga;
    boolean tampada;

    // criando método
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.caraga);
        System.out.println("Está tampada? " + this.tampada);
    }
    // void significa sem retorno
    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
    }
    //Diz faz referencia ao objeto
    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
