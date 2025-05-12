package aula13;
public class Mamifero extends Animal{
    
    // Atributos
    private String corPelo;
    
    // Métodos públicos
    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
    
    
    // Métodos especiais
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
