package generics.storage;
import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    private List<T> elements;

    public GenericStorage() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T o) {
        elements.add(o);
    }

    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            elements.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Invalid index!");
            return null;
        }
    }

    public int getSize() {
        return elements.size();
    }

    public void displayAll() {
        System.out.println(elements);
    }
}
