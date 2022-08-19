package Exercise1.Products;

public class Electronics extends Product {
    private String type;
    private int length;
    private int width;
    private int height;
    private int weight;

    protected Electronics(String name, String description, float price, int quantity, String type, int length, int width, int height, int weight) {
        super(name, description, price, quantity);
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    protected void getInfo() {
        super.getInfo();
        System.out.print("\ntype: " + type + "\nlength: " + length + " cm" + "\nwidth: " + width + " cm" + "\nheight: " + height + " cm" + "\nweight: " + weight + " kg");
    }
}
