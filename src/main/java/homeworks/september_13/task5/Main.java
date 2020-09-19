package homeworks.september_13.task5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Figure figure = new Figure();

        boolean flag = true;
        while (flag) {
            System.out.println(figure.toString());
            System.out.println("Make your choice:\n" +
                    "1) Add row\n" +
                    "2) Delete row\n" +
                    "3) Add column\n" +
                    "4) Delete column\n" +
                    "5) Exit");
            figure.createFigure();
            figure.showFigure();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> figure.addRow();
                case 2 -> figure.deleteRow();
                case 3 -> figure.addColumn();
                case 4 -> figure.deleteColumn();
                case 5 -> flag = false;
            }
        }
    }
}
