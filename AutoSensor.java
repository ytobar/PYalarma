import java.util.Vector;
import java.util.Enumeration;

public class AutoSensor {
    private Vector<SistemaAlarmaListener> sistemas = new Vector<>();

    public void registrar(SistemaAlarmaListener sistema) {
        sistemas.addElement(sistema);
    }

    public void activarAlarma() {
        for (Enumeration<SistemaAlarmaListener> e = sistemas.elements(); e.hasMoreElements();) {
            e.nextElement().alarma();
        }
    }
}
