public class Usuario {

    private String nome;
    private String matricula;

    public Usuario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: " + nome +
                "\nMatricula: " + matricula;
    }
}
