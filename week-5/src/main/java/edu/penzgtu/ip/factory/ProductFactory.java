package edu.penzgtu.ip.factory;

public class ProductFactory {
    public static Product getInstance(String type) {
        Product product = null;

        switch (type) {
            case "book" -> product = new Book(1, "Book", "Author", 12);
            case "clothes" -> product = new Clothes(1, "Clothes", "Category", 3);
            default -> {
            }
        }

        return product;
    }
}
