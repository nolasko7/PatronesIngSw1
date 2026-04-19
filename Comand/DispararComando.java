class DispararComando implements Command{
    private Jugador jugador;
    public DispararComando(Jugador jugador){
        this.jugador=jugador;
    }
    public void execute(){
        this.jugador.disparar();
    }
}