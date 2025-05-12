package aula10;

public class Aluno extends Pessoa{
    
    // Atributos
    private int matricula;
    private String curso;
    
    
    // Métodos públicos
    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
    }
    
    
    // Métodos especiais

    public int getMatricula() {
        return this.matricula;
    }
    public String getCurso() {
        return this.curso;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

   

    
}
