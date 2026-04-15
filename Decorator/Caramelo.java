package Decorator;

class Caramelo extends Extra {
    public Caramelo(Cafe cafe) { super(cafe); }
    public String getDescripcion() { return cafe.getDescripcion() + " + caramelo"; }
    public double getPrecio()      { return cafe.getPrecio() + 0.75; }
}
