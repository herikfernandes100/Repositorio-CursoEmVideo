
package aula05;

public class Aula05 {
    public static void main(String[] args){
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1);
        p1.setDono("Herik");
        p1.abrirConta("CC");
        p1.depositar(100);
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2);
        p2.setDono("Higor");
        p2.abrirConta("CP");
        p2.depositar(500);
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
