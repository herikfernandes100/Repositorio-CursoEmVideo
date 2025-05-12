package aula06;
public class ControleRemoto implements Controlador{
    
    // Atributos
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Metodos Especiais

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return this.volume;
    }

    private boolean isLigado() {
        return this.ligado;
    }

    private boolean isTocando() {
        return this.tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Metodos Abstratos
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta tocando: " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        System.out.print(" ");
        for (int i = 0; i < this.getVolume(); i+=10){
            System.out.print("-");
        }
        System.out.println("");
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechar Menu");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !this.tocando){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && this.tocando){
            this.setTocando(false);
        }
    }
     
}
