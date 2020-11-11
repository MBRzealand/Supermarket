package FruitSection;

import FoodProduct.Food;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Fruits extends Food {

    private final LocalDateTime currentDate = LocalDateTime.now();

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    static LocalDateTime expDate(){

        int daysFromNow = (int) (Math.random()*14);

        LocalDateTime now = LocalDateTime.now();

        return now.plusDays(daysFromNow);
    }

    static void isRipe(Fruits x){



    }


    static String formatDate(LocalDateTime x){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formatter.format(x);
    }



}
