public class EscritorioAd {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public EscritorioAd(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone);
    }

    public void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado para: " + novoEndereco);
    }

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Telefone atualizado para: " + novoTelefone);
    }
}
