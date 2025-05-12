package aula09;
public class Livro implements Publicacao{
    // Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos públicos
    public String detalhes(){
        return "Livro" + "\ntitulo: " + titulo + ", \nautor: " + autor 
                + "\ntotPaginas: " + totPaginas + ", \npagAtual: " + pagAtual 
                + "\naberto: " + aberto + "\nleitor: " + leitor.getNome();
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int pagina) {
        if(pagina > this.getTotPaginas()){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(pagina);
        }
    }
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
    
    // Métodos especiais
    public String getTitulo() {
        return this.titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public int getTotPaginas() {
        return this.totPaginas;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public boolean isAberto() {
        return this.aberto;
    }
    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
}
