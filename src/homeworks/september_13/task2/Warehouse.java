package homeworks.september_13.task2;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warehouse {

    private final HashSet<Item> warehouse;
    private int getIntFromString;

    public Warehouse(HashSet<Item> warehouse) {
        this.warehouse = warehouse;
    }

    public void addItem(Item item) {
        this.warehouse.add(item);
    }


    public Item getItem(String itemName) {
        return this.warehouse.stream()
                .filter(e -> e.getName().equals(itemName))
                .findAny()
                .orElse(null);
    }

    public void displayItem(String itemName) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            System.out.println(item.toString());
        }
    }

    public void deleteItem(String itemName) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            this.warehouse.remove(item);
        }
    }

    public void setItemPrice(String itemName, double itemPrice) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            item.setPrice(itemPrice);
        }
    }

    public void displayItemPrice(String itemName) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            System.out.println(item.getName() + ": " + item.getPrice());
        }
    }

    public void setItemQuantity(String itemName) {
        String[] parts = itemName.split(":");
        String itemNamePart = parts[0];
        String itemQuantityPart = parts[1];
        int getIntFromString = Integer.parseInt(itemQuantityPart.replaceAll("[^0-9]", ""));

        Item item = getItem(itemNamePart);

        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            if (itemQuantityPart.contains("+")) {
                item.setQuantity(item.getQuantity() + getIntFromString);
            } else if (itemQuantityPart.contains("-")) {
                if (item.getQuantity() >= getIntFromString) {
                    item.setQuantity(item.getQuantity() - getIntFromString);
                } else {
                    System.out.println("Not enough quantity");
                }
            } else {
                item.setQuantity(getIntFromString);
            }
        }
    }

    public void displayItemQuantity(String itemName) {
        Item item = getItem(itemName);
        if (item == null) {
            System.out.println("No such item in warehouse");
        } else {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }

    public void showAll() {
        this.warehouse.forEach(System.out::println);
    }

    public void showItemNamesSorted() {
        List<String> itemNamesSorted = this.warehouse.stream()
                .map(Item::getName)
                .sorted()
                .collect(Collectors.toList());

        itemNamesSorted.forEach(System.out::println);
    }

    public void showItemPricesSorted() {
        Map<String, Double> itemPricesSorted = this.warehouse.stream()
                .collect(Collectors.toMap(Item::getName, Item::getPrice));

        itemPricesSorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }

    public void showItemQuantitiesSorted() {
        Map<String, Integer> itemQuantitiesSorted = this.warehouse.stream()
                .collect(Collectors.toMap(Item::getName, Item::getQuantity));

        itemQuantitiesSorted.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
