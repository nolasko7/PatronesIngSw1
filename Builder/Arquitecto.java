public class Arquitecto{
    private ConstructorCasa builder;
    public Arquitecto(ConstructorCasa builder){
        this.builder = builder;
    }
    public void cambiarBuilder(ConstructorCasa builder){
        this.builder = builder;
    }
    public void construirCasaModerna(){
        builder.reset();
        builder.construirTipoEstructura("Hormigon");
        builder.construirPisos(2);
        builder.construirGaraje(true);
        builder.construirJardin(true);
        builder.construirPiscina(false);
    }
    public void construirCasaAntigua(){
        builder.reset();
        builder.construirTipoEstructura("Madera");
        builder.construirPisos(1);
        builder.construirGaraje(false);
        builder.construirJardin(true);
        builder.construirPiscina(false);
    }

}