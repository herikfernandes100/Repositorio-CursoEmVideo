package aula08;

// Bibliotecas
import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    // Métodos públicos
    public void marcarLuta(Lutador desafiante, Lutador desafiado){
        if(desafiante.getCategoria().equals(desafiado.getCategoria()) && desafiante != desafiado){
            this.setAprovada(true);
            this.setDesafiado(desafiado);
            this.setDesafiante(desafiante);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if(this.isAprovada()){
            
            System.out.println("");
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            System.out.println("");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            
            System.out.println("");
            System.out.println("===== RESULTADO =====");
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: //Ganhou desafiado
                    System.out.println("Vitória do: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: //Ganhou desafiante
                    System.out.println("Vitória do: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
        }else {
            System.out.println("A luta não pode acontecer");
        }
        System.out.println("=====================");
    }
    
    // Métodos especiais
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public int getRounds() {
        return this.rounds;
    }
    public boolean isAprovada() {
        return this.aprovada;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    
}
