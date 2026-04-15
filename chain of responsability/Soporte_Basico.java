package Chain_of_responsability;

// Manejador concreto 1
class SoporteBasico extends Soporte {
    @Override
    public void manejar(int nivel) {
        if (nivel == 1) {
            System.out.println("Soporte básico resolvió el problema nivel 1");
        } else {
            System.out.println("Soporte básico no puede, pasando al siguiente...");
            super.manejar(nivel);
        }
    }
}
