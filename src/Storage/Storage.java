package Storage;

import FoodProduct.Items;
import FruitSection.Apple;
import FruitSection.Lemon;
import FruitSection.Orange;
import VegetableSection.Corn;
import VegetableSection.Cucumber;
import VegetableSection.Salad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Storage extends Items{

    private static final ArrayList<Items> inStorage = new ArrayList<>();

    public static ArrayList<Items> getInStorage() {
        return inStorage;
    }


    public static void restockALL(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Apple());
            inStorage.add(new Lemon());
            inStorage.add(new Orange());
            inStorage.add(new Corn());
            inStorage.add(new Salad());
            inStorage.add(new Cucumber());

        }

    }

    public static void restockApples(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Apple());

        }

    }

    public static void restockLemons(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Lemon());

        }

    }

    public static void restockOranges(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Orange());

        }

    }

    public static void restockCorn(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Corn());

        }

    }

    public static void restockSalad(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Salad());

        }

    }

    public static void restockCucumber(int restockAmount){

        for (int i = 0; i < restockAmount; i++) {

            inStorage.add(new Cucumber());

        }

    }



    public static void itemsInStorage(){

        System.out.println("The current number of items in storage is: " + inStorage.size());

    }

    public static void storageOverview(){

        for (Items items : inStorage) {

            System.out.println(items.getClass().getSimpleName());

        }
    }



    public static void amountInStorage(String item){

        int amount = 0;

        for (Items items : inStorage) {
            if (items.getClass().getSimpleName().equals(item)) {
                amount += 1;
            }
        }

        if (amount == 1) {
            System.out.println("There is " + amount + " " + item + " in storage");
        }else{
            System.out.println("There are " + amount + " " + item + "s in storage");
        }

    }


    protected static void sortStorage(){
        Collections.sort(inStorage, Comparator.comparing(o -> o.getClass().getName()));
    }


}
