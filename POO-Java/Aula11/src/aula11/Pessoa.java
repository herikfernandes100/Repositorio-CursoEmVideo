package aula11;
public abstract class Pessoa {
    
    // Atributos
    private String nome;
    private int idade;
    private String sexo;
    
    // Métodos públicos
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }
    
    // Métodos especiais

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return this.sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + ", sexo: " + sexo + '}';
    }

    
    
    


    
}
