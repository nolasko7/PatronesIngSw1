public class ServicioWhatsApp {
    public void wsSetNumero(String numero) {
        System.out.println("Numero configurado: " + numero);
    }
    public void wsRedactarMensaje(String texto) {
        System.out.println("Mensaje redactado: " + texto);
    }
    public void wsConectar() {
        System.out.println("Conectando...");
    }
    public void wsTransmitir() {
        System.out.println("Transmitiendo mensaje...");
    }
    public void wsDesconectar() {
        System.out.println("Desconectando.");
    }
}