public class Caneta {
    //Adicionando visibilidade
    public String modelo;
    public String cor;
    private float ponta;
    protected int caraga;
    private boolean tampada;

    // criando método
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.caraga);
        System.out.println("Está tampada? " + this.tampada);
    }
    // void significa sem retorno
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }
    }
    //Diz faz referencia ao objeto
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}

