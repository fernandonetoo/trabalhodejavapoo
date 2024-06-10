class Servico {
    private String tipo;
    private String descricao;
    private String data;

    public Servico(String tipo, String descricao, String data) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.data = data;
    }

    public void solicitar() {
        System.out.println("Serviço " + tipo + " solicitado para " + data + " com descrição: " + descricao);
    }
}