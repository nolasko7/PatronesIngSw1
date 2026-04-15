package Decorator;

// Componente base
class CafeSimple implements Cafe {
    public String getDescripcion() { return "Café"; }
    public double getPrecio()      { return 1.00; }
}
