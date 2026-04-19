class SaltarComando implements Command{
    private Jugador jugador;
    public SaltarComando(Jugador jugador){
        this.jugador = jugador;
    }
    public void execute(){
        this.jugador.saltar();
    }
}