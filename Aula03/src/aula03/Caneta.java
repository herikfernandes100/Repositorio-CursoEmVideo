
package aula03;


public class Caneta {
    //atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor:  " + this.cor);
        System.out.println("Ponta:  " + this.ponta);
        System.out.println("Tampada:  " + this.tampada);
        System.out.println("Carga: :  " + this.carga);
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
