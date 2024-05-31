import java.util.List;

public class Curso {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getCursosTecnicos() {
        return cursosTecnicos;
    }

    public void setCursosTecnicos(List<String> cursosTecnicos) {
        this.cursosTecnicos = cursosTecnicos;
    }

    private String descricao;
    private List<String> cursosTecnicos;

    public Curso(String nome, String descricao, List<String> cursosTecnicos) {
        this.nome = nome;
        this.descricao = descricao;
        this.cursosTecnicos = cursosTecnicos;
    }

    public void exibirLista() {
        System.out.println("Curso: " + nome + " - " + descricao);
        for (String curso : cursosTecnicos) {
            System.out.println("Curso Técnico: " + curso);
        }
    }
}
