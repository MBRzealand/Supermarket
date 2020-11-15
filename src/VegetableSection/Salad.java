package VegetableSection;

import java.time.LocalDateTime;

public class Salad extends Vegetables{

    private final String expDate;
    private final String ripeDate;
    private final boolean isRipe;
    private final boolean canBeFrozen;

    // ----------------------------------------------{  Getters  }------------------------------------------------------

    public String getexpDate() {
        return expDate;
    }

    public String getRipeDate() {
        return ripeDate;
    }

    public boolean getCanBeFrozen() {
        return canBeFrozen;
    }

    public boolean isRipe() {
        return isRipe;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public Salad(){

        LocalDateTime expires = expDate();


        int daysBeforeRipe = (int) (Math.random()*((expires.getDayOfMonth() - getCurrentDate().getDayOfMonth()) / 2 ));
        LocalDateTime ripeDate = getCurrentDate().plusDays(daysBeforeRipe);


        this.expDate = formatDate(expires);
        this.ripeDate = formatDate(ripeDate);
        this.isRipe = getCurrentDate() == ripeDate;
        this.canBeFrozen = true;

        setPrice(5);

    }

}
