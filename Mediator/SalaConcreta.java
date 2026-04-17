package Mediator;
import java.util.ArrayList;
import java.util.List;

public class SalaConcreta implements SalaDeChat {
    private List<Usuario> usuarios = new ArrayList<>();

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviarMensaje(String mensaje, Usuario emisor) {
        for (Usuario u : usuarios) {
            if (u != emisor) {
                u.recibirMensaje(mensaje, emisor.getNombre());
            }
        }
    }
}