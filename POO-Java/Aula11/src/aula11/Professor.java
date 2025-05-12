package aula11;
public final class Professor extends Pessoa{
    
    // Atributos
    private String especialidade;
    private float salario;
    
    // Métodos públicos
    public void receberAumento(float aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    // Métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
}
