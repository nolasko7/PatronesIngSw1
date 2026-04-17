package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(4, 6));

        Visitante area      = new CalculadorArea();
        Visitante perimetro = new CalculadorPerimetro();

        System.out.println("--- Áreas ---");
        for (Figura f : figuras) {
            f.aceptar(area);
        }

        System.out.println("--- Perímetros ---");
        for (Figura f : figuras) {
            f.aceptar(perimetro);
        }
    }
}
