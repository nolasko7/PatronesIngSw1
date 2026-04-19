class Memento{
    private String nombre;
    private int checkpoint;
    private Juego juego;

    public Memento(Juego juego, String nombre, int checkpoint) {
        this.juego = juego;
        this.nombre = nombre;
  
        this.checkpoint = checkpoint;
    }

   public void restore() {
        juego.setNombre(nombre);
        juego.setCheckpoint(checkpoint);
    }
}