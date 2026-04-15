package Decorator;
// Uso
public class Main {
    public static void main(String[] args) {
        Cafe pedido = new Caramelo(new Leche(new CafeSimple()));

        System.out.println(pedido.getDescripcion()); // Café + leche + caramelo
        System.out.println(pedido.getPrecio());      // 2.25
    }
}
