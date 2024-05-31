public class Servico extends Usuario {
    private String tipo;
    private String descricao;
    private String data;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Servico(String tipo, String descricao, String data) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
    }

    public void solicitar() {
        System.out.println("Serviço " + tipo + " solicitado para " + data + " com descrição: " + descricao);
    }
}
