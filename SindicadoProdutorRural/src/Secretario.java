import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;


class Secretario extends UsuarioBase {
    public Secretario(String nome, String senha, String login) {
        super(nome, senha, login);
    }


    public void associarSindicato(Scanner scanner) {
        System.out.println("Digite o nome do Produtor Rural:");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do Produtor Rural:");
        String propriedade = scanner.nextLine();
        System.out.println("Digite o telefone do Produtor Rural:");
        String telefone = scanner.nextLine();
        // System.out.println("\n"+"==========//==========");
        System.out.println("\nProdutor rural cadastrado!"+"\n" + "Nome:"+ nome + "\n"+"Endereço:" + propriedade + "\n" + "Telefone:" + telefone+"\n");
        // System.out.println("==========//=========="+"\n");
    }

    public void solicitarServicos(Scanner scanner) {
        System.out.println("Digite 1 para serviços do escritorio de advocacia."+"\n"+"Digite 2 para serviços do consultorio de odontologia.");
    }

    public void solicitarVisita(Scanner scanner) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<String> datas = new ArrayList<>(3);
        datas.add("05/06/2024");
        datas.add("15/06/2024");
        datas.add("30/06/2024");
    }

    // System.out.println("\n"+"==========//==========");
    // System.out.println("VISITA SOLITADA PARA SEMANA QUE VEM.");
    // System.out.println("==========//=========="+"\n");


    public void exibirCursosTecnicos() {
        ArrayList<String> cursosTecnicos = new ArrayList<>();
        cursosTecnicos.add("Curso de Nutrição animal.");
        cursosTecnicos.add("Curso de Fertilidade do solo.");
        cursosTecnicos.add("Curso de Melhoramento de plantas.");

        // System.out.println("\n"+"==========//==========");
        System.out.println("\nCursos Técnicos Disponíveis:");
        for (String curso : cursosTecnicos) {
            System.out.println("- " + curso);
        }
        System.out.println();
    }

    public void solicitarDocumentacao() {
        // System.out.println("\n"+"==========//==========");
        System.out.println("\nFOI SOLICITADA A DOCUMENTAÇÃO DO PRODUTOR RURAL.\n");
        // System.out.println("==========//=========="+"\n");
    }

    @Override
    public void fazerLogin() {

    }

    @Override
    public void exibirAcoes() {
        System.out.println("AÇÕES DISPONIVEIS PARA SECRETARIO:");
        System.out.println("1 - Associar Produtor Rural ao Sindicato");
        System.out.println("2 - Solicitar Serviços");
        System.out.println("3 - Solicitar Visita");
        System.out.println("4 - Exibir Cursos");
        System.out.println("5 - Solicitar Documentação");
        System.out.println("6 - Sair do programa");
    }

    @Override
    public void exibirAcoesTec() {
    }
}