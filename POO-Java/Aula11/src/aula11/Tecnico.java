package aula11;

public final class Tecnico extends Aluno{
    
    // Atributos
    private int registroProfissional;
    
    // Métodos públicos
    public void praticar(){
        System.out.println(this.getNome() + " está praticando");
    }
    
    // Métodos especiais
    public int getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    
    
    
}
