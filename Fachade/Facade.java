class Facade{
    private inventory inventory;
    private payment payment;
    private Envio envio;

    public Facade() {
        this.inventory = new inventory();
        this.payment = new payment();
        this.envio = new Envio();
    }

    public void tomarOrden(String cliente, String item, int cantidad) {
        if (inventory.checkStock(item)) {
            System.out.println("Stock disponible para: " + item);
            if (payment.processPayment(cliente, cantidad)) {
                inventory.reserveItem(item);
                envio.programandoEnvio(cliente, item);
                System.out.println("Orden completada para: " + cliente);
            } else {
                System.out.println("Pago fallido para: " + cliente);
            }
        } else {
            System.out.println("Stock insuficiente para: " + item);
        }
    }
}