package Mediator;

public class Usuario {
      private String nombre;
    private SalaDeChat sala;

    public Usuario(String nombre, SalaDeChat sala) {
        this.nombre = nombre;
        this.sala   = sala;
    }

    public String getNombre() { return nombre; }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        sala.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje, String deQuien) {
        System.out.println(nombre + " recibe de " + deQuien + ": " + mensaje);
    }
}
