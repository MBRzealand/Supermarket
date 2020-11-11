package FoodProduct;

import java.text.DecimalFormat;

public class Food {

    static String pattern = ".00";

    static DecimalFormat df = new DecimalFormat(pattern);

    private double price;



    // --------------------------------------------{Setters and Getters}------------------------------------------------

    public String getPrice() {
        return df.format(price) + " kr";
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // -----------------------------------------------------------------------------------------------------------------
}
