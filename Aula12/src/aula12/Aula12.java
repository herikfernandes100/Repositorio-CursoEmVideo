package aula12;
public class Aula12 {
    public static void main(String[] args) {
        
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover(); // Correndo
        m.alimentar(); // Mamando
        m.emitirSom(); // Som de mamífero
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover(); // Nadando
        p.alimentar(); // Comendo substâncias
        p.emitirSom(); // Peixe não emite som
        p.soltarBolha();
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover(); // Voando
        a.alimentar(); // Comendo frutas
        a.emitirSom(); // Som de ave
        a.fazerNinho();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        c.setPeso(55.3f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        
                
    }
    
}
