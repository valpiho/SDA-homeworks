package homeworks.september_13.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Figure {

    private List<ArrayList<String>> listOfLists;
    private int rows;
    private int columns;

    public Figure() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many rows you want");
        this.rows = scanner.nextInt();
        System.out.println("Please enter how many rows you want");
        this.columns = scanner.nextInt();

    }

    public void createFigure() {
        this.listOfLists = new ArrayList<>();
        for (int i = 0; i <= this.rows; i++) {
            this.listOfLists.add(i, new ArrayList<>());
            for (int j = 0; j <= this.columns; j++) {
                String f = "*";
                this.listOfLists.get(i).add(j, f);
            }
        }
    }

    public void showFigure() {
        this.listOfLists.forEach(System.out::println);
    }

    public void addRow() {
        this.rows++;
    }

    public void deleteRow() {
        if (this.rows > 0)
            this.rows--;
    }

    public void addColumn() {
        this.columns++;
    }

    public void deleteColumn() {
        if (this.columns > 0)
            this.columns--;
    }

    @Override
    public String toString() {
        return "Figure :" +
                "rows = " + rows +
                ", columns = " + columns + "\n";
    }
}
