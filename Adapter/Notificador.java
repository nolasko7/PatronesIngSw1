public interface Notificador {
    void setDestinatario(String destinatario);
    void setMensaje(String mensaje);
    void enviar();
}