public class ProdutorRural {
    private String nome;
    private String propriedade;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(String propriedade) {
        this.propriedade = propriedade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ProdutorRural(String nome, String propriedade, String telefone) {
        this.nome = nome;
        this.propriedade = propriedade;
        this.telefone = telefone;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Propriedade: " + propriedade + ", Telefone: " + telefone);
    }

    public void atualizarPropriedade(String novaPropriedade) {
        this.propriedade = novaPropriedade;
        System.out.println("Propriedade atualizada para: " + novaPropriedade);
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Telefone atualizado para: " + novoTelefone);
    }
}
