import java.util.List;

public class Visita {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

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
