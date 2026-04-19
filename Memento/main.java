class main{
    public static void main(String args[]){
        Juego juego = new Juego("Mario kart",1);
        CareTaker careTaker = new CareTaker();
        System.out.println(juego);  
        juego.setCheckpoint(2);
        careTaker.saveMemento(juego.save());// Guardamos el estado del juego en el checkpoint 2
        juego.setCheckpoint(3);
        juego.setCheckpoint(4);
        System.out.println(juego);
        careTaker.saveMemento(juego.save());// Guardamos el estado del juego en el checkpoint 4
        Memento memento = careTaker.getMemento(1);
        memento.restore();
        System.out.println(juego);
        memento = careTaker.getMemento(2);
        memento.restore();
        System.out.println(juego);
        //memento:Guarda y restaura el estado de un objeto sin exponer sus detalles internos
    }
}