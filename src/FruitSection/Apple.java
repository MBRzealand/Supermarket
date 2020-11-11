package FruitSection;

import java.time.LocalDateTime;

public class Apple extends Fruits {

    private final String expDate;
    private final String ripeDate;
    private final boolean isRipe;

    // ----------------------------------------------{  Getters  }------------------------------------------------------

    public String getexpDate() {
        return expDate;
    }

    public String getRipeDate() {
        return ripeDate;
    }

    public boolean isRipe() {
        return isRipe;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public Apple(){

        LocalDateTime expires = expDate();


        int daysBeforeRipe = (int) (Math.random()*((expires.getDayOfMonth() - getCurrentDate().getDayOfMonth()) / 2 ));
        LocalDateTime ripeDate = getCurrentDate().plusDays(daysBeforeRipe);


        this.expDate = formatDate(expires);
        this.ripeDate = formatDate(ripeDate);
        this.isRipe = getCurrentDate() == ripeDate;


        setPrice(2.50);

    }
}
