public class Actuador extends Dispositivo {
    private double posicion;
    private double potencia;
    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }
    @Override
    public String obtenerEstadoOperacion() {
        return "Actuador funcionando en la posicion " + posicion;
    }
    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo: Actuador" + "\nPosicion: " + posicion + "\nPotencia: " + potencia + "\nEstado: " + obtenerEstadoOperacion();
    }
}