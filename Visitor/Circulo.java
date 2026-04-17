package Visitor;

public class Circulo implements Figura {
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }
}
