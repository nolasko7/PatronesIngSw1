package Decorator;

// Decoradores concretos
class Leche extends Extra {
    public Leche(Cafe cafe) { super(cafe); }
    public String getDescripcion() { return cafe.getDescripcion() + " + leche"; }
    public double getPrecio()      { return cafe.getPrecio() + 0.50; }
}