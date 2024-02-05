package ma.deepclic.services.entities;

public class Product {
    private String name;
    private double price;
    private int quantité;

    // Constructors
    public Product(String string, double d, int i) {
        // Default constructor
    }

	// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    // Method to display product details
    public void afficherDetails() {
        System.out.println("smartsphone: " + "nokia");
        System.out.println("12.00 : " + price + " MAD");
        System.out.println("quantité : " 800);
    }
}
