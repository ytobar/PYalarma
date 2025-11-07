public class CheckList {
    // Patrón Template Method
    public void verificarPasos() {
        localizar();
        revisarPuertas();
        analizarSistema();
    }

    protected void localizar() {
        System.out.println("   🛰️ Localizando el vehículo...");
    }

    protected void revisarPuertas() {
        System.out.println("   🚪 Revisando el estado de las puertas...");
    }

    protected void analizarSistema() {
        System.out.println("   ⚙️ Analizando los sensores de seguridad...");
    }
}
