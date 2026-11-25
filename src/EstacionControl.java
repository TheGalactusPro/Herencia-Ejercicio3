import java.util.ArrayList;
public class EstacionControl {
    private ArrayList<Dispositivo> dispositivos;
    public EstacionControl() {
        dispositivos = new ArrayList<>();
    }
    public void agregarDispositivo(Dispositivo dispositivo) {
        dispositivos.add(dispositivo);
    }
    public Dispositivo buscarDispositivo(String codigo) {
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.getCodigo().equals(codigo)) {
                return dispositivo;
            }
        }
        return null;
    }
    public int contarActivos() {
        int contador = 0;
        for (Dispositivo dispositivo : dispositivos) {
            if (dispositivo.isActivo()) {
                contador++;
            }
        }
        return contador;
    }
    public String mostrarDispositivos() {
        String resultado = "";
        for (Dispositivo dispositivo : dispositivos) {
            resultado += dispositivo.mostrarInformacion() + "\n\n";
        }
        return resultado;
    }
}