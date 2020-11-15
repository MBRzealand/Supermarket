package FoodProduct;

import FruitSection.Apple;
import FruitSection.Fruits;
import FruitSection.Lemon;
import FruitSection.Orange;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Items{

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
