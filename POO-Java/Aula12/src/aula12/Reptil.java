package aula12;
public class Reptil extends Animal{

    // Atributos
    private String corEscama;
    
    // Métodos públicos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Come vegetais");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
    
    
    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
