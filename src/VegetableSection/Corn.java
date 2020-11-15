package VegetableSection;

import java.time.LocalDateTime;

public class Corn extends Vegetables implements Freeze{

    private final String expDate;
    private final String ripeDate;
    private final boolean isRipe;
    private final boolean canBeFrozen = true;
    private boolean isFrozen;

    // ----------------------------------------------{  Getters  }------------------------------------------------------

    public String getexpDate() {
        return expDate;
    }

    public String getRipeDate() {
        return ripeDate;
    }

    public boolean isCanBeFrozen() {
        return canBeFrozen;
    }

    public boolean getIsFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    public boolean isRipe() {
        return isRipe;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public Corn(){

        LocalDateTime expires = expDate();


        int daysBeforeRipe = (int) (Math.random()*((expires.getDayOfMonth() - getCurrentDate().getDayOfMonth()) / 2 ));
        LocalDateTime ripeDate = getCurrentDate().plusDays(daysBeforeRipe);


        this.expDate = formatDate(expires);
        this.ripeDate = formatDate(ripeDate);
        this.isRipe = getCurrentDate() == ripeDate;
        this.isFrozen = getIsFrozen();

        setPrice(3.75);

    }

    @Override
    public void freeze() {
        setFrozen(true);
    }
}
