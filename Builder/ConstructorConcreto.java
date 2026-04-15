public class ConstructorConcreto implements ConstructorCasa {
    private Casa resultado;

    @Override
    public void reset() {
        this.resultado = new Casa();
    }
    @Override
    public void construirTipoEstructura(String tipo) {
        resultado.setTipoEstructura(tipo);
    }
 
    @Override
    public void construirPisos(int cantidad) {
        resultado.setPisos(cantidad);
    }

    @Override
    public void construirGaraje(boolean siOno) {
        resultado.setGaraje(siOno);
    }

    @Override
    public void construirJardin(boolean siOno) {
        resultado.setJardin(siOno);
    }

    @Override
    public void construirPiscina(boolean siOno) {
        resultado.setPiscina(siOno);
    }

    public Casa getCasa() {
        return this.resultado;
    }
}