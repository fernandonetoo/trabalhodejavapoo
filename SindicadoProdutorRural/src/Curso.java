import java.util.ArrayList;

class Curso {
    private String nome;
    private String descricao;
    private ArrayList<String> cursosTecnicos;

    public Curso(String nome, String descricao, ArrayList<String> cursosTecnicos) {
        this.nome = nome;
        this.descricao = descricao;
        this.cursosTecnicos = cursosTecnicos;
    }

    public void exibirLista() {
        System.out.println("Curso: " + nome + " - " + descricao);
        for (String curso : cursosTecnicos) {
            System.out.println("Curso TÃ©cnico: " + curso);
        }
    }
}