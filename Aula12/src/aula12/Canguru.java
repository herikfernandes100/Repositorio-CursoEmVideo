package aula12;
public class Canguru extends Mamifero{
    // Métodos públicos
    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }
    @Override
    public void locomover(){
        System.out.println("Saltando");
    }
    
}
