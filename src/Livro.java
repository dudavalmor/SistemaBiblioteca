public class Livro {

    private String titulo;
    private String autor;
    private String idLivro;
    private String anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, String idLivro, String anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = idLivro;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean emprestar(){
        if(!disponivel){
            System.out.println("O livro já está em empréstimo");
            return false;
        } else {
            disponivel = false;
            System.out.println("O livro foi emprestado com sucesso");
            return true;
        }
    }

    public boolean devolver(){
        if(disponivel){
            System.out.println("O livro já está disponível");
            return false;
        } else {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso");
            return true;
        }
    }

    @Override
    public String toString(){
        return "Título: " + titulo +
                "\nAutor: " + autor +
                "\nAno de publicação: " + anoPublicacao +
                "\nId do livro: " + idLivro +
                "\nDisponível: " + disponivel;
    }

}
