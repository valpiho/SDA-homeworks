package homeworks.september_13.task2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        Warehouse warehouse = new Warehouse(new HashSet<>());

        warehouse.addItem(new Item("Chilli", 3.47, 6));
        warehouse.addItem(new Item("Banana", 12.02, 1));
        warehouse.addItem(new Item("Apple", 7.47, 2));


        warehouse.setItemQuantity("Banana:-4");
        warehouse.setItemQuantity("Apple:+10");
        warehouse.setItemQuantity("Chilli:2");

        System.out.println("------------------------------------");
        warehouse.showAll();

        System.out.println("------------------------------------");
        warehouse.displayItem("Banana");
        warehouse.displayItemPrice("Banana");
        warehouse.displayItemQuantity("Banana");

        System.out.println("------------------------------------");
        warehouse.showItemNamesSorted();

        System.out.println("------------------------------------");
        warehouse.showItemPricesSorted();

        System.out.println("------------------------------------");
        warehouse.showItemQuantitiesSorted();


    }
}
