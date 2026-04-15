public class AdaptadorWhatsApp implements Notificador {
    private ServicioWhatsApp servicioWs = new ServicioWhatsApp();

    @Override
    public void setDestinatario(String destinatario) {
        servicioWs.wsSetNumero(destinatario);
    }

    @Override
    public void setMensaje(String mensaje) {
        servicioWs.wsRedactarMensaje(mensaje);
    }

    @Override
    public void enviar() {
        servicioWs.wsConectar();
        servicioWs.wsTransmitir();
        servicioWs.wsDesconectar();
    }
}