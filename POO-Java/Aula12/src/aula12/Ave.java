package aula12;
public class Ave extends Animal{

    // Atributos
    private String corPena;
    
    
    // Métodos públicos
    public void fazerNinho(){
        System.out.println("Construiu ninho");
    }
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som da ave");
    }
    
    // Métodos especiais
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
