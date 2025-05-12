
package aula02;


public class Caneta {
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor:  " + this.cor);
        System.out.println("Ponta:  " + this.ponta);
        System.out.println("Tampada:  " + this.tampada);
        System.out.println("Carga: :  " + this.carga);
    }
    
    void rabiscar(){
        if(this.tampada){
            System.out.println("ERRO! Caneta esta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
    
}
