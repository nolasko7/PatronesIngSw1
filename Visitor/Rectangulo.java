package Visitor;

public class Rectangulo implements Figura {
    public double ancho;
    public double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto  = alto;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}