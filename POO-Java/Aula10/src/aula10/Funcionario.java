package aula10;
public class Funcionario extends Pessoa{
    
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    // Métodos especias

    public String getSetor() {
        return this.setor;
    }
    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    // Métodos Publicos
    
    public void mudarTrabalho(){
        if(this.isTrabalhando()){
            this.setTrabalhando(false);
        }else{
            this.setTrabalhando(true);
        }
    }
}
