package Chain_of_responsability;

// Uso
public class Main {
    public static void main(String[] args) {

        // Armar la cadena
        Soporte basico   = new SoporteBasico();
        Soporte tecnico  = new SoporteTecnico();
        Soporte experto  = new SoporteExperto();

        basico.setSiguiente(tecnico);
        tecnico.setSiguiente(experto);

        // Enviar solicitudes
        basico.manejar(1); // Soporte básico resolvió el problema nivel 1
        System.out.println("---");
        basico.manejar(2); // Pasa por básico → técnico lo resuelve
        System.out.println("---");
        basico.manejar(3); // Pasa por básico → técnico → experto lo resuelve
        System.out.println("---");
        basico.manejar(4); // Nadie puede manejarlo
    }
}
