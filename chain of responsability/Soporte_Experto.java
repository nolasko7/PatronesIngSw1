package Chain_of_responsability;

// Manejador concreto 3
class SoporteExperto extends Soporte {
    @Override
    public void manejar(int nivel) {
        if (nivel == 3) {
            System.out.println("Experto resolvió el problema nivel 3");
        } else {
            super.manejar(nivel);
        }
    }
}
