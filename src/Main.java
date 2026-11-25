public class Main {
    public static void main(String[] args) {
        Dispositivo d1 = new Sensor("S01", "Temperatura", true, 24.5, "°C");
        Dispositivo d2 = new Sensor("S02", "Humedad", false, 60.0, "%");
        Dispositivo d3 = new Actuador("A01", "Valvula", true, 50, 2.5);
        Dispositivo d4 = new Actuador("A02", "Motor", true, 80, 5.0);
        EstacionControl estacion = new EstacionControl();
        estacion.agregarDispositivo(d1);
        estacion.agregarDispositivo(d2);
        estacion.agregarDispositivo(d3);
        estacion.agregarDispositivo(d4);
        System.out.println("DISPOSITIVOS REGISTRADOS");
        System.out.println(estacion.mostrarDispositivos());
        System.out.println("DISPOSITIVOS ACTIVOS");
        System.out.println("Cantidad: " + estacion.contarActivos());
        System.out.println("\nBUSCAR DISPOSITIVO");
        Dispositivo encontrado = estacion.buscarDispositivo("S01");
        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Dispositivo no encontrado");
        }
    }
}