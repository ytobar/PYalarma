# PYalarma

Explicación del Problema

En los automóviles modernos, los sistemas de seguridad deben reaccionar automáticamente ante eventos de alarma como intentos de robo o intrusión.
Cuando la alarma se activa, distintos subsistemas deben ejecutar acciones coordinadas:

Las luces deben parpadear.
La bocina debe sonar.
El centro de monitoreo debe ejecutar una verificación del estado del vehículo.

Explicación de la Solución

Para resolver el problema, se aplica el Patrón de Diseño Observer (Observador) junto con el Template Method (Método Plantilla).

Patrón Observer (Observador)
Permite que un objeto (“sujeto”) notifique automáticamente a otros (“observadores”) cuando ocurre un cambio.
En este caso:

El AutoSensor es el Sujeto  detecta la intrusión.
Los observadores son:
Luces
Bocina
CentroMonitoreo

Cuando el sensor detecta el evento, avisa a todos los sistemas registrados mediante el método alarma().

Patrón Template Method (Método Plantilla)
El CentroMonitoreo hereda de la clase CheckList, que define una plantilla de pasos para realizar verificaciones.