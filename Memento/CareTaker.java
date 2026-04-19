
import java.util.ArrayList;

class CareTaker {
    private ArrayList<Memento> mementos = new ArrayList<>();

    public void saveMemento(Memento memento) {
        this.mementos.add(memento);
    }

    public Memento getMemento(int index) {
        return mementos.get(index-1);
    }
}