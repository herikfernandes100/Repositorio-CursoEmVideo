package aula09;
public class Pessoa {
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
    public int getIdade() {
        return this.idade;
    }
    public String getSexo() {
        return this.sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    
    
}
