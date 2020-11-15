package VegetableSection;

import FoodProduct.Items;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vegetables extends Items {


    private final LocalDateTime currentDate = LocalDateTime.now();

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }



    static LocalDateTime expDate(){

        int daysFromNow = (int) (Math.random()*14);

        LocalDateTime now = LocalDateTime.now();

        return now.plusDays(daysFromNow);
    }


    static String formatDate(LocalDateTime x){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return formatter.format(x);
    }




}
