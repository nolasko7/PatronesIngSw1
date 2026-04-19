public class main {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Command saltar = new SaltarComando(jugador);
        Command correr = new CorrerComando(jugador);
        Command disparar = new DispararComando(jugador);
        Joystick joystick = new Joystick();
        joystick.setButtonA(saltar);
        joystick.setButtonB(correr);
        joystick.setButtonC(disparar);
        joystick.pressButtonA();
        joystick.pressButtonB();
        joystick.pressButtonC();

        //Resumen del patron command: el patron command es un patron que divide las acciones que puede realizar una clase en comandos, 
        //cada comando es una clase que implementa una interfaz command, esta interfaz tiene un metodo execute que es el que se encarga de ejecutar la accion, 
        //el invoker es el joystick que es el que se encarga de llamar al metodo execute de cada comando, y el receiver es el jugador que es el que se encarga de realizar la accion.
    }
}