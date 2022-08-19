package Exercise1.Products;

public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;

    protected Product(String name, String description, float price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    protected void getInfo() {
        System.out.print("\nname: " + name + "\ndescription: " + description + "\nprice: " + price + " lei" + "\nquantity: " + quantity);
    }
}
