import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private Usuario[] usuarios = new Usuario[10];
    private Livro[] livros = new Livro[10];
    private Emprestimo[] emprestimos = new Emprestimo[10];
    private int qntUsuarios, qntLivros, qntEmprestimos;

    public void cadastrarUsuario(String nome, String matricula){
        if(qntUsuarios >= usuarios.length){
            System.out.println("A quantidade de usuários já atingiu o limite");
        } else {
            Usuario usuario = new Usuario(nome, matricula);
            usuarios[qntUsuarios] = usuario;
            qntUsuarios++;
        }
    }

    public Usuario buscarUsuario(String matricula){
        for(int i = 0; i < qntUsuarios; i++){
            if(usuarios[i].getMatricula().equals(matricula)){
                return usuarios[i];
            }
        }
        return null;
    }

    public void cadastrarLivro(String titulo, String autor, String idLivro, String anoPublicacao){
        if(qntLivros >= livros.length){
            System.out.println("A biblioteca já está cheia. Não é possível cadastrar mais livros!");
        } else {
            if (buscarLivro(idLivro) != null){
                System.out.println("O livro com esse id já existe!");
            } else {
                Livro livro = new Livro(titulo, autor, idLivro, anoPublicacao);
                livros[qntLivros] = livro;
                qntLivros++;
            }
        }
    }

    public Livro buscarLivro(String idLivro){
        for (int i = 0; i < qntLivros; i++){
            if (livros[i].getIdLivro().equals(idLivro)){
                return livros[i];
            }
        }
        return null;
    }

    public List<Livro> buscarLivroPorTitulo (String titulo){
        List<Livro> encontrados = new ArrayList<>();
        for (int i = 0; i < qntLivros; i++) {
            if(livros[i].getTitulo().toLowerCase().contains(titulo.toLowerCase())){
                encontrados.add(livros[i]);
            }
        }
        return encontrados;
    }

    public void realizarEmprestimo(String matricula, String idLivro, String data){
        if(qntEmprestimos >= emprestimos.length){
            System.out.println("Quantidade de empréstimos atingida!");
        } else {
            Usuario usuarioEncontrado = buscarUsuario(matricula);
            if (usuarioEncontrado == null){
                System.out.println("Usuário não encontrado");
            } else {
                Livro livroEncontrado = buscarLivro(idLivro);
                if(livroEncontrado == null){
                    System.out.println("Livro não encontrado");
                } else{
                    if(!livroEncontrado.isDisponivel()){
                        System.out.println("O livro está em emprétimo");
                    } else {
                        livroEncontrado.emprestar();
                        Emprestimo emprestimo = new Emprestimo(usuarioEncontrado, livroEncontrado, data);
                        emprestimos[qntEmprestimos] = emprestimo;
                        qntEmprestimos++;
                    }
                }
            }
        }
    }

    public void realizarDevolucao(String idLivro){
        boolean emprestimoEncontrado = false;
        for (int i = 0; i < qntEmprestimos; i++) {
            if(emprestimos[i].getLivro().getIdLivro().equals(idLivro)){
                emprestimos[i].getLivro().devolver();
                emprestimoEncontrado = true;
                for (int j = i; j < qntEmprestimos - 1; j++) {
                    emprestimos[j] = emprestimos[j+1];
                }
                qntEmprestimos--;
                break;
            }
        }
        if(!emprestimoEncontrado){
            System.out.println("Empréstimo não encontrado");
        }
    }

    public void listarLivros(){
        if(qntLivros == 0){
            System.out.println("Não há nenhum livro cadastrado.");
        }
        for (int i = 0; i < qntLivros; i++){
            System.out.println(livros[i]);
        }
    }

    public void listarEmprestimos(){
        if(qntEmprestimos == 0){
            System.out.println("Não há nenhum empréstimo no momento");
        } else{
            for (int i = 0; i < qntEmprestimos; i++) {
                System.out.println(emprestimos[i]);
            }
        }
    }

}
