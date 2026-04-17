package Visitor;
public class CalculadorArea implements Visitante {
    @Override
    public void visitar(Circulo c) {
        double area = Math.PI * c.radio * c.radio;
        System.out.println("Área del círculo: " + area);
    }

    @Override
    public void visitar(Rectangulo r) {
        double area = r.ancho * r.alto;
        System.out.println("Área del rectángulo: " + area);
    }
}