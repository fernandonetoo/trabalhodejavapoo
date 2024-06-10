import java.util.Scanner;

abstract class UsuarioBase implements Usuario {
    //Atributos
    private String nome;
    private String senha;
    private String login;

    //Construtor
    public UsuarioBase(String nome, String senha, String login) {
        this.nome = nome;
        this.senha = senha;
        this.login = login;

    }
    //Métodos Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Métodos
    public void fazerLogin(Scanner scanner) {
        String user = scanner.nextLine();
        System.out.println(this.getNome() + "Fez login no sistema");
    }

    public void sair() {
        System.out.println(this.getNome() + "Saiu do sistema.");
    }
    //Exibir ações do Secretário
    public abstract void exibirAcoes();

}