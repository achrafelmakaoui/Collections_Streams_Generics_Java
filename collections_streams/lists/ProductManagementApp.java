package collections_streams.lists;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Mouse", 400));
        products.add(new Product(2, "Keyboard", 500));
        products.add(new Product(3, "Phone", 3000));
        products.add(new Product(4, "Ipad", 4000));

        products.remove(3);

        System.out.println("List of products:");
        products.forEach(System.out::println);

        products.set(0, new Product(1, "Gaming Laptop", 12000));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();

        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                System.out.println("Product: " + p);
                break;
            }
        }
        scanner.close();
    }
}
