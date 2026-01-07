package generics.storage;

public class Application {
    public static void main(String[] args) {
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);
        intStorage.displayAll();

        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Hello");
        stringStorage.addElement("World");
        stringStorage.displayAll();

        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(5.5);
        doubleStorage.addElement(7.7);
        doubleStorage.displayAll();
    }
}