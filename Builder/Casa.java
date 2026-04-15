//Producto
public class Casa{
    private String tipoEstructura;
    private int pisos;
    private boolean garaje;
    private boolean jardin;
    private boolean piscina;

    //setters para el builder
    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tipoEstructura='" + tipoEstructura + '\'' +
                ", pisos=" + pisos +
                ", garaje=" + garaje +
                ", jardin=" + jardin +
                ", piscina=" + piscina +
                '}';
    }

}