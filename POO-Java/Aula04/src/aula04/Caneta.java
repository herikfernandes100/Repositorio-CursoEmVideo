
package aula04;


public class Caneta {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    //Construtor
    public Caneta(String modelo, String cor, float ponta){
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.setCarga(100);
    }

    //getters
    public String getModelo() {
        return this.modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public int getCarga() {
        return this.carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    //Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    //Métodos
    void status(){
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Cor:  " + this.getCor());
        System.out.println("Ponta:  " + this.getPonta());
        System.out.println("Tampada:  " + this.isTampada());
        System.out.println("Carga: :  " + this.getCarga());
    }
    
    public void escrever(){
        if(this.tampada){
            System.out.println("ERRO! Caneta esta tampada");
        }else{
            System.out.println("Escrevendo");
        }
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Caneta esta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
}
