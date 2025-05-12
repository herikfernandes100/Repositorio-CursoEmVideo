package aula10;
public class Professor extends Pessoa{
    
    // Atributos
    private String especialidade;
    private float salario;
    
    
    // Métodos especiais
    public String getEspecialidade() {
        return this.especialidade;
    }
    public float getSalario() {
        return this.salario;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    
    // Métodos públicos
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    
}
