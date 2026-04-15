public class Main {
    public static void main(String[] args) {
        ConstructorConcreto builder = new ConstructorConcreto();
        Arquitecto arquitecto = new Arquitecto(builder);

        arquitecto.construirCasaModerna();
        Casa casa1 = builder.getCasa();
        System.out.println(casa1.toString());

        arquitecto.construirCasaAntigua();
        Casa casa2 = builder.getCasa();
        System.out.println(casa2.toString());
    }
}