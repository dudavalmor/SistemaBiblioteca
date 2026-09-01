public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;

    public Emprestimo(Usuario usuario, Livro livro, String dataEmprestimo) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario.getNome() +
                "\nLivro: " + livro.getTitulo() +
                "\nData empréstimo: " + dataEmprestimo;
    }
}
