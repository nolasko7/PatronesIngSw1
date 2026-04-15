//Metodos para counstruir la casa
public interface ConstructorCasa {
    void reset();
    void construirTipoEstructura(String tipo);
    void construirPisos(int cantidad);
    void construirGaraje(boolean siOno);
    void construirJardin(boolean siOno);
    void construirPiscina(boolean siOno);
}