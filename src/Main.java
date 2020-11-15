import Storage.Storage;


public class Main extends Storage{


    public static void main(String[] args) {

        // Level 1
        Storage.restockApples(1);
        restockLemons(3);
        restockOranges(2);
        restockCorn(1);
        restockSalad(2);

        System.out.println();

        itemsInStorage();
        System.out.println();


        // Level 2
        storageOverview();
        System.out.println();

        // Level 3
        amountInStorage("Apple");
        amountInStorage("Lemon");
        amountInStorage("Orange");
        amountInStorage("Cucumber");
        amountInStorage("Corn");
        amountInStorage("Salad");
        System.out.println();

        restockALL(2);

        storageOverview();
        System.out.println();

        amountInStorage("Cucumber"); // was 0 before is 2 after RestockAll
        System.out.println();

        sortStorage();// everything is sorted neatly now
        storageOverview();


    }

}
