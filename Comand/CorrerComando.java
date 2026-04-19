
class CorrerComando implements Command{
    private Jugador jugador;
    public CorrerComando(Jugador jugador){
        this.jugador=jugador;
    }
    public void execute(){
        this.jugador.correr();
    }
}