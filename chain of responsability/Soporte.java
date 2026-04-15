package Chain_of_responsability;

// Manejador abstracto
abstract class Soporte {
    protected Soporte siguiente;

    public void setSiguiente(Soporte siguiente) {
        this.siguiente = siguiente;
    }

    public void manejar(int nivel) {
        if (siguiente != null) {
            siguiente.manejar(nivel);
        } else {
            System.out.println("Nadie pudo manejar el problema nivel " + nivel);
        }
    }
}
