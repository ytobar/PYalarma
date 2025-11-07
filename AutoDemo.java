public class AutoDemo {
    public static void main(String[] args) {
        AutoSensor sensor = new AutoSensor();

        // Registrar los sistemas observadores
        sensor.registrar(new Luces());
        sensor.registrar(new Bocina());
        sensor.registrar(new CentroMonitoreo());

        System.out.println("🚗 Sistema de seguridad del automóvil activado...");
        sensor.activarAlarma();
    }
}
