public enum Animal {
    PORCO("Porco", "OK", "SAUDÁVEL"),
    VACA("Vaca", "PENDENTE", "DOENTE"),
    BEZERRO("Bezerro", "OK", "SAUDÁVEL"),
    CABRA("Cabra", "PENDENTE", "DOENTE");

    private final String nome;
    private final String estadoVacinacao;
    private final String estadoSaude;

    Animal(String nome, String estadoVacinacao, String estadoSaude) {
        this.nome = nome;
        this.estadoVacinacao = estadoVacinacao;
        this.estadoSaude = estadoSaude;
    }

    public String getNome() {
        return nome;
    }

    public String getEstadoVacinacao() {
        return estadoVacinacao;
    }

    public String getEstadoSaude() {
        return estadoSaude;
    }

    public static void exibirCartaoVacinacao() {
        // System.out.println("\n==========//==========");
        System.out.println("\nLista de animais vacinados:");
        for (Animal animal : Animal.values()) {
            System.out.println("- " + animal.getNome() + " (" + animal.getEstadoVacinacao() + ")");
        }
        System.out.println();
    }

    public static void exibirSaudeAnimais() {
        // System.out.println("\n==========//==========");
        System.out.println("\nLista da saúde dos animais:");
        for (Animal animal : Animal.values()) {
            System.out.println("- " + animal.getNome() + " (" + animal.getEstadoSaude() + ")");
        }
        System.out.println();
    }
}