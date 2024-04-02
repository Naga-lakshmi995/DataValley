import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure consistency in serialization
    private int id;
    private String name;
    private String category;
    private double price;

    public Product(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    // Getter and Setter methods
    // (Omitted for brevity)

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "Laptop", "Electronics", 999.99);

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("product.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(product);
            System.out.println("Serialized data is saved in product.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("product.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Product deserializedProduct = (Product) in.readObject();
            System.out.println("Deserialized Product:");
            System.out.println(deserializedProduct);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
