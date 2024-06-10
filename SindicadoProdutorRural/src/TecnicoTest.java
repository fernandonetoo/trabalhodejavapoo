import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TecnicoTest {

    @Test
    public void testIndiceMortesBaixo() {
        // Simula a entrada do usuário para um número de mortes baixo
        String input = "5\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        Tecnico tecnico = new Tecnico("Joarlison","4321","joarlison321");
        tecnico.indiceMortes(scanner);

        // Restaura a saída original do System.out
        System.setOut(originalOut);

        // Verifica a saída
        String expectedOutput = "Digite a quantidade de mortes dos animais (mês)" + System.lineSeparator() +
                "O índice de mortalidade está BAIXO!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testIndiceMortesAlto() {
        // Simula a entrada do usuário para um número de mortes alto
        String input = "45\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        Tecnico tecnico = new Tecnico("Joarlison","4321","joarlison321");
        tecnico.indiceMortes(scanner);

        // Restaura a saída original do System.out
        System.setOut(originalOut);

        // Verifica a saída
        String expectedOutput = "Digite a quantidade de mortes dos animais (mês)" + System.lineSeparator() +
                "O índice de mortalidade está ALTO!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testIndiceMortesNormal() {
        // Simula a entrada do usuário para um número de mortes normal
        String input = "25\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);

        // Captura a saída do método
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Chama o método a ser testado
        Tecnico tecnico = new Tecnico("Joarlison","4321","joarlison321");
        tecnico.indiceMortes(scanner);

        // Restaura a saída original do System.out
        System.setOut(originalOut);

        // Verifica a saída
        String expectedOutput = "Digite a quantidade de mortes dos animais (mês)" + System.lineSeparator() +
                "O índice de mortalidade está NORMAL!" + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());
    }
}