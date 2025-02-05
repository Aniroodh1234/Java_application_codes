class Product {
    private String productName;
    private String productID;
    private double price;
    private int quantityInStock;

    public Product(String productName, String productID, double price, int quantityInStock) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage < 0 || discountPercentage > 100) {
            System.out.println("Invalid discount percentage!");
            return;
        }
        price -= price * (discountPercentage / 100);
    }

    // Getter methods
    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    // Display product details
    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
    }
}

public class Ecommerce {
    public static void main(String[] args) {
        Product p1 = new Product("Smartphone", "samsung_A55", 500.0, 10);
        p1.displayProduct();
        
        System.out.println("\nApplying 10% discount.");
        p1.applyDiscount(10);
        p1.displayProduct();
    }
}
