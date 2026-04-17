package Mediator;

public class Main {
     public static void main(String[] args) {
        SalaConcreta sala = new SalaConcreta();

        Usuario ana   = new Usuario("Ana",   sala);
        Usuario luis  = new Usuario("Luis",  sala);
        Usuario maria = new Usuario("Maria", sala);

        sala.agregarUsuario(ana);
        sala.agregarUsuario(luis);
        sala.agregarUsuario(maria);

        ana.enviar("Hola a todos!");
        System.out.println("---");
        luis.enviar("Buenas!");
    }
}
