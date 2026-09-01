import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner leia = new Scanner(System.in);
    private static Biblioteca biblioteca = new Biblioteca();

    public static void main(String[] args) {
        menu();
    }

    private static void menu(){

        int opcao;

        while(true){
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                 BIBLIOTECA VIRTUAL                  ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("       1- Cadastrar livro                            ");
            System.out.println("       2- Cadastrar usuário                          ");
            System.out.println("       3- Listar livros                              ");
            System.out.println("       4- Buscar livro por título                    ");
            System.out.println("       5- Realizar empréstimo                        ");
            System.out.println("       6- Devolver livro                             ");
            System.out.println("       7- Listar empréstimos ativos                  ");
            System.out.println("       0- Sair                                       ");
            System.out.println("                                                     ");
            System.out.println("Digite a opção desejada: ");

            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e){
                System.out.println("\nDigite valores inteiros");
                leia.nextLine();
                continue;
            }

            if(opcao == 0){
                System.out.println("Encerrando aplicação....");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao){
                case 1:
                    leia.nextLine();
                    System.out.println("Cadastrar livro");
                    System.out.println("Digite o  título do livro: ");
                    String titulo = leia.nextLine();
                    System.out.println("Digite o autor do livro: ");
                    String autor = leia.nextLine();
                    System.out.println("Digite o id do livro: ");
                    String idLivro = leia.nextLine();
                    System.out.println("Digite o ano de publicação: ");
                    String anoPublicacao = leia.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor, idLivro, anoPublicacao);
                    break;
                case 2:
                    leia.nextLine();
                    System.out.println("Cadastrar usuário");
                    System.out.println("Digite o nome do usuário: ");
                    String nome = leia.nextLine();
                    System.out.println("Digite a matrícula do usuário: ");
                    String matricula = leia.nextLine();
                    biblioteca.cadastrarUsuario(nome, matricula);
                    break;
                case 3:
                    System.out.println("Listar livros");
                    biblioteca.listarLivros();
                    break;
                case 4:
                    leia.nextLine();
                    System.out.println("Buscar livro por título");
                    System.out.println("Digite o titulo desejado: ");
                    String tituloLivro = leia.nextLine();
                    List<Livro> livrosEncontrados = biblioteca.buscarLivroPorTitulo(tituloLivro);
                    if(livrosEncontrados.isEmpty()){
                        System.out.println("Livro não encontrado");
                    } else {
                        for(Livro livro : livrosEncontrados){
                            System.out.println(livro);
                        }
                    }
                    break;
                case 5:
                    leia.nextLine();
                    System.out.println("Realizar empréstimo");
                    System.out.println("Digite a matricula do usuario: ");
                    String matriculaUsuario = leia.nextLine();
                    System.out.println("Digite o id do livro: ");
                    String idLivro2 = leia.nextLine();
                    System.out.println("Digite a data do empréstimo: ");
                    String dataEmprestimo = leia.nextLine();
                    biblioteca.realizarEmprestimo(matriculaUsuario, idLivro2, dataEmprestimo);
                    break;
                case 6:
                    leia.nextLine();
                    System.out.println("Devolver livro");
                    System.out.println("Digite o id do livro: ");
                    String id = leia.nextLine();
                    biblioteca.realizarDevolucao(id);
                    break;
                case 7:
                    System.out.println("Listar empréstimos ativos");
                    biblioteca.listarEmprestimos();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }


    }

    public static void sobre() {
        System.out.println("****************************************************");
        System.out.println("Projeto Desenvolvido por: ");
        System.out.println("Eduarda Valmor - eduarda.bserrano@gmail.com");
        System.out.println("github.com/dudavalmor");
        System.out.println("****************************************************");

    }
}
