class Juego{
    private String nombre;

    private int checkpoint;

    public Juego(String nombre, int checkpoint) {
        this.nombre = nombre;

        this.checkpoint = checkpoint;
    }

    public void setCheckpoint(int checkpoint) {
        this.checkpoint = checkpoint;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


    public int getCheckpoint() {
        return checkpoint;
    }
    public Memento save() {
        return new Memento(this,nombre,checkpoint);
    }
    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", checkpoint=" + checkpoint +
                '}';
    }

}