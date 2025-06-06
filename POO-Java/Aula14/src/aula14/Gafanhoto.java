package aula14;
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    
    
    // Métodos públicos
    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }
    
    
    // Métodos especiais
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.totAssistido = 0;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistido() {
        return totAssistido;
    }
    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "\nlogin: " + login + ", totAssistido: " + totAssistido + '}';
    }
    
    
    
}
