public class Sensor extends Dispositivo {
    private double lectura;
    private String unidad;
    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo);
        this.lectura = lectura;
        this.unidad = unidad;
    }
    @Override
    public String obtenerEstadoOperacion() {
        return "Sensor registrando una lectura de " + lectura + " " + unidad;
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo: Sensor" + "\nLectura: " + lectura + "\nUnidad: " + unidad + "\nEstado: " + obtenerEstadoOperacion();
    }
}