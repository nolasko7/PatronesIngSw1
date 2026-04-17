package Visitor;

public class CalculadorPerimetro implements Visitante {
    @Override
    public void visitar(Circulo c) {
        double perimetro = 2 * Math.PI * c.radio;
        System.out.println("Perímetro del círculo: " + perimetro);
    }

    @Override
    public void visitar(Rectangulo r) {
        double perimetro = 2 * (r.ancho + r.alto);
        System.out.println("Perímetro del rectángulo: " + perimetro);
    }
}
