public class SistemaAvisos {
    public static void main(String[] args) {
        Notificador notificador;

        // Email — implementacion propia
        notificador = new NotificadorEmail();
        notificador.setDestinatario("usuario@mail.com");
        notificador.setMensaje("Tu pedido fue confirmado");
        notificador.enviar();

        System.out.println();

        // WhatsApp — servicio externo adaptado
        notificador = new AdaptadorWhatsApp();
        notificador.setDestinatario("+5491112345678");
        notificador.setMensaje("Tu pedido fue confirmado");
        notificador.enviar();
    }
}