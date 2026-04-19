public class payment {
    public boolean processPayment(String cliente, int cantidad) {
        System.out.println("Procesando pago de $" + cantidad + " para: " + cliente);
        return true;
    }
}