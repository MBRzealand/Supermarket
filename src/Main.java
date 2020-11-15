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

        restockALL(10);

        storageOverview();
        System.out.println();

        amountInStorage("Cucumber"); // was 0 before is 10 after RestockAll
        System.out.println();

        sortStorage();// everything is sorted neatly now
        System.out.println();

        storageOverview();
        System.out.println();

        itemsInStorage();   // 69 objects in storage... happy little accidents
        System.out.println();


    }

}
