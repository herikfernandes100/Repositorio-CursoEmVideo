
package aula05;
public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Getters
    public int getNumConta() {
        return this.numConta;
    }
    public String getTipo() {
        return this.tipo;
    }
    public String getDono() {
        return this.dono;
    }
    public float getSaldo() {
        return this.saldo;
    }
    public boolean isStatus() {
        return this.status;
    }

    // Setters
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //Métodos
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if("CC".equals(this.getTipo())){
            this.setSaldo(50);
        }else if("CP".equals(this.getTipo())){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() >0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo()< 0){
            System.out.println("Conta em debito");
        }else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(float valor){
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado");
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float valor){
        if(this.isStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizado");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensal(){
        float valor = 0f;
        if("CC".equals(this.getTipo())){
            valor = 12;
        }else if("CP".equals(this.getTipo())){
            valor = 20;
        }
        if(this.isStatus()){
            if(this.getSaldo() > valor){
                this.setSaldo(this.getSaldo() - valor);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel pagar");
        }
    }
    
    // Construtor
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);  
    }
}

