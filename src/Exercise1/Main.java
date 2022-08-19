package Exercise1;

/*
1) Define the following classes:

Product : price, name, description, quantity

Cosmetics (extends Product): color, weight

Electronics (extends Product): type(String), length, width, height, weight

Fridge (extends Electronics): temperature

create a Main where you use them.
 */

import Exercise1.Products.*;

public class Main {
    public static void main(String[] args) {
        // the Products and Electronics class (probably) isn't supposed to be called in main because they are superclasses,
        //  so I put the protected modifier and moved the Main class in another folder so that they can't be called
        Cosmetics cosmetics = new Cosmetics("cosmetic 1", "does stuff", 4.53f, 23, "red", 1.2f);
        Fridge fridge = new Fridge("fridge 1", "holds stuff in it", 1699.99f, 6, "the good type", 93, 86, 195, 246, 10);

        cosmetics.getInfo();

        System.out.println();
        fridge.getInfo();
    }
}
