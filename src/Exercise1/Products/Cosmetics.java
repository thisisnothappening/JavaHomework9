package Exercise1.Products;

public class Cosmetics extends Product {
    private String color;
    private float weight;

    public Cosmetics(String name, String description, float price, int quantity, String color, float weight) {
        super(name, description, price, quantity);
        this.color = color;
        this.weight = weight;
    }

    public void getInfo() {
        super.getInfo();
        System.out.print("\ncolor: " + color + "\nweight: " + weight + " kg");
    }
}
