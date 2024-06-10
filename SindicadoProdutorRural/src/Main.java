import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Secretario sec = new Secretario("ZÉ", "1234", "ze123");
        Tecnico tec = new Tecnico("JOARLISON", "4321", "joalison321");
        Scanner scanner = new Scanner(System.in);
        final DateTimeFormatter FORMATADOR_DATA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final LocalDate HOJE = LocalDate.now();
        final int NUMERO_MAXIMO_DATAS = 3;
        ArrayList<LocalDate> datasVisitas = new ArrayList<>();

        System.out.println("Escolha 1 para secretario e 2 para técnico:");
        int escolha = Integer.parseInt(scanner.nextLine());

        if (escolha == 1) {
            System.out.println(sec.getNome() + " ESCOLHEU O ACESSO PARA SECRETÁRIO.");
            while (true) {
                sec.exibirAcoes();
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        sec.associarSindicato(scanner);
                        break;
                    case 2:
                        sec.solicitarServicos(scanner);
                        int serv = Integer.parseInt(scanner.nextLine());
                        if (serv == 1) {
                            // System.out.println("\n==========//==========");
                            System.out.println("\n- Consultoria jurídica.\n- Aposentadoria.\n");
                            // System.out.println("==========//==========\n");
                        } else if (serv == 2) {
                            // System.out.println("\n==========//==========");
                            System.out.println("\n- Limpeza dentária.\n- Remoção de dente.\n");
                            // System.out.println("==========//==========\n");
                        } else {
                            // System.out.println("\n==========//==========");
                            System.out.println("OPÇÃO INVÁLIDA, TENTE NOVAMENTE!");
                            // System.out.println("==========//==========\n");
                        }
                        break;
                    case 3:
                        sec.solicitarVisita(scanner);
                        while (true) {
                            try {
                                System.out.print("Informe a data da visita (dd/MM/yyyy): ");
                                String dataString = scanner.nextLine();
                                LocalDate data = LocalDate.parse(dataString, FORMATADOR_DATA);

                                // Validação: data futura e não duplicada
                                if (data.isBefore(HOJE)) {
                                    System.out.println("Erro: Data informada é passada. Informe uma data futura.");

                                }

                                if (datasVisitas.contains(data)) {
                                    System.out.println("\nData informada já existe. Deseja substituir a data na posição" + (datasVisitas.indexOf(data) + 1) + "? (S/N): ");
                                    String resposta = scanner.nextLine().toUpperCase();

                                    if (resposta.equals("S")) {
                                        // Substituir a data na posição do índice
                                        datasVisitas.set(datasVisitas.indexOf(data), data);
                                        System.out.println("\nData substituída com sucesso!\n");
                                        break; // Sair do loop while
                                    } else {
                                        System.out.println("\nOperação cancelada. Continue informando as datas.\n");
                                    }
                                } else {
                                    datasVisitas.add(data);
                                    System.out.println("\nData adicionada com sucesso!\n");
                                    break; // Sair do loop while
                                }
                            } catch (DateTimeParseException e) {
                                System.out.println("\nErro: Formato de data inválido. Tente novamente.\n");
                            } catch (InputMismatchException e) {
                                System.out.println("\nErro: Entrada inválida. Digite uma data no formato dd/MM/yyyy.\n");
                                scanner.nextLine(); // Limpar buffer de entrada
                            }
                        }
                        break;
                    case 4:
                        sec.exibirCursosTecnicos();
                        break;
                    case 5:
                        sec.solicitarDocumentacao();
                        break;
                    case 6:
                        System.out.println("\nSAINDO DO PROGRAMA, OBRIGADO POR USAR NOSSO SISTEMA.");
                        return; // Encerra o método main e, consequentemente, o programa
                    default:
                        System.out.println("Escolha uma opção válida.");
                }
            }
        } else if (escolha == 2) {
            System.out.println(tec.getNome() + " ESCOLHEU O ACESSO PARA TÉCNICO.");
            while (true) {
                tec.exibirAcoesTec();
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        tec.visualizarListaVisitaTec();
                        break;
                    case 2:
                        tec.exibirCartaoVacinacao();
                        break;
                    case 3:
                        tec.reproducaoAnimais();
                        break;
                    case 4:
                        tec.indiceMortes(scanner);
                        break;
                    case 5:
                        tec.exibirSaudeAnimais();
                        break;
                    case 6:
                        System.out.println("SAINDO DO PROGRAMA, OBRIGADO POR USAR NOSSO SISTEMA.");
                        return; // Encerra o método main e, consequentemente, o programa
                    default:
                        System.out.println("Escolha uma opção válida.");
                }
            }
        } else {
            System.out.println("Escolha uma opção válida.");
        }
    }
}
