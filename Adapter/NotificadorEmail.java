public class NotificadorEmail implements Notificador {
    private String destinatario;
    private String mensaje;

    @Override
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado a " + destinatario + ": " + mensaje);
    }
}