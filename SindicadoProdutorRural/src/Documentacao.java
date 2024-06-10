class Documentacao {
    private String tipo;
    private String descricao;

    public Documentacao(String tipo, String descricao) {
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public void solicitar() {
        System.out.println("Documentação " + tipo + " solicitada com descrição: " + descricao);
    }
}