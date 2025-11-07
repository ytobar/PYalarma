public class CentroMonitoreo extends CheckList implements SistemaAlarmaListener {
    public void alarma() {
        System.out.println("💻 Centro de monitoreo activado - realizando verificación:");
        verificarPasos();
    }

    protected void revisarPuertas() {
        System.out.println("   🔒 Verificando bloqueo automático de puertas.");
    }
}
