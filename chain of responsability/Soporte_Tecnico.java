package Chain_of_responsability;

// Manejador concreto 2
class SoporteTecnico extends Soporte {
    @Override
    public void manejar(int nivel) {
        if (nivel == 2) {
            System.out.println("Soporte técnico resolvió el problema nivel 2");
        } else {
            System.out.println("Soporte técnico no puede, pasando al siguiente...");
            super.manejar(nivel);
        }
    }
}
