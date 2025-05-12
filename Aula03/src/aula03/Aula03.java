
package aula03;
public class Aula03 {
    public static void main(String[] args) {
        //instanciando Caneta
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Preta";
        c1.carga = 90;
        c1.status();
        c1.destampar();
        c1.rabiscar();
    }
    
}
