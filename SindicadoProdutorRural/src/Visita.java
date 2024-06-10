import java.util.List;

// Classe Visita
class Visita {
    private String data;
    private String local;

    public Visita(String data, String local) {
        this.data = data;
        this.local = local;
    }

    public void solicitar() {
        System.out.println("Visita solicitada para " + data + " no local " + local);
    }

    public static void exibirLista(List<Visita> visitas) {
        for (Visita visita : visitas) {
            System.out.println("Data: " + visita.data + ", Local: " + visita.local);
        }
    }
}