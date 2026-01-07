package generics.product;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display products");
            System.out.println("2. Search product by id");
            System.out.println("3. Add product");
            System.out.println("4. Delete product by id");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    metier.getAll().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter product id: ");
                    long idSearch = scanner.nextLong();
                    Product found = metier.findById(idSearch);
                    System.out.println(found != null ? found : "Product not found");
                    break;
                case 3:
                    System.out.print("Enter id, name, brand, price, description, stock: ");
                    long id = scanner.nextLong();
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    String brand = scanner.nextLine();
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    String desc = scanner.nextLine();
                    int stock = scanner.nextInt();
                    metier.add(new Product(id, name, brand, price, desc, stock));
                    System.out.println("Product added!");
                    break;
                case 4:
                    System.out.print("Enter product id to delete: ");
                    long idDel = scanner.nextLong();
                    metier.delete(idDel);
                    System.out.println("Product deleted if existed.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        scanner.close();
    }
}
