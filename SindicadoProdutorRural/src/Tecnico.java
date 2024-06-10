import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tecnico extends UsuarioBase {
    private List<Animal> animais;

    public Tecnico(String nome, String senha, String login) {
        super(nome, senha, login);
        this.animais = new ArrayList<>();
        for (Animal animal : Animal.values()) {
            this.animais.add(animal);
        }
    }

    @Override
    public void exibirAcoesTec() {
        System.out.println("AÇÕES DISPONÍVEIS PARA TÉCNICO:");
        System.out.println("1 - Exibir lista para visitas.");
        System.out.println("2 - Exibir cartão de vacinação.");
        System.out.println("3 - Exibir reprodução de animais.");
        System.out.println("4 - Exibir índice de mortes de animais.");
        System.out.println("5 - Exibir saúde dos animais.");
        System.out.println("6 - Sair do programa.");
    }

    public void visualizarListaVisitaTec() {
        ArrayList<String> enderecos = new ArrayList<>();
        enderecos.add("Rua Felipe Camarão");
        enderecos.add("Rua Elias Asfora");
        enderecos.add("Rua do Prado");
        enderecos.add("Rua João Elizeu de Medeiros");
        //System.out.println("\n==========//==========");
        System.out.println("\nEndereços para visitar:");
        for (String visita : enderecos) {
            System.out.println("- " + visita);
        }
        System.out.println();
    }

    public void exibirCartaoVacinacao() {
        Animal.exibirCartaoVacinacao();
    }

    public void exibirSaudeAnimais() {
        Animal.exibirSaudeAnimais();
    }

    public void reproducaoAnimais() {
        //System.out.println("\n==========//==========");
        System.out.println("\nO boi reproduziu com a vaca e tiveram um bezerro, e viveram felizes para sempre.\n");
        //System.out.println("==========//==========\n");
    }

    public void indiceMortes(Scanner scanner) {
        System.out.println("Digite a quantidade de mortes dos animais (mês)");
        Integer morte = Integer.valueOf(scanner.nextLine());
        //System.out.println("\n==========//==========");
        if (morte < 10) {
            System.out.println("O índice de mortalidade está BAIXO!");
        } else if (morte > 40) {
            System.out.println("O índice de mortalidade está ALTO!");
        } else {
            System.out.println("O índice de mortalidade está NORMAL!");
        }
        //System.out.println("==========//==========\n");
    }

    @Override
    public void fazerLogin() {

    }

    @Override
    public void exibirAcoes() {
        // Implementação vazia ou específica para Técnico
    }
}