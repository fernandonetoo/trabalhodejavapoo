public class Documentacao {
    private String tipo;
    private String descricao;

    public Documentacao(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void solicitar() {
        System.out.println("Documentação " + tipo + " solicitada com descrição: " + descricao);
    }
}
