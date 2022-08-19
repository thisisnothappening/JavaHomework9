package Exercise1.Products;

import Exercise1.Products.Electronics;

public class Fridge extends Electronics {
    private float temperature;

    public Fridge(String name, String description, float price, int quantity, String type, int length, int width, int height, int weight, float temperature) {
        super(name, description, price, quantity, type, length, width, height, weight);
        this.temperature = temperature;
    }

    public void getInfo() {
        super.getInfo();
        System.out.print("\ntemperature: " + temperature + " C");
    }
}
