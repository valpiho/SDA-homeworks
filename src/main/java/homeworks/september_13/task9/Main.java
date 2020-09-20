package homeworks.september_13.task9;

import de.svenjacobs.loremipsum.LoremIpsum;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    private static String data;

    public static void main(String[] args) {

        LoremIpsum loremIpsum = new LoremIpsum();
        String setText = loremIpsum.getWords( 50 );

        try {
            FileWriter myWriter = new FileWriter("Lorem.txt");
            myWriter.write(setText);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            File myObj = new File("lorem.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String[] words = data.split("([\\W\\s]+)");
        Map<String, Integer> counts = new HashMap<>();

        for (String word: words) {
            if (counts.containsKey(word)) {
                counts.put(word, counts.get(word) + 1);
            } else {
                counts.put(word, 1);
            }
        }

        counts.forEach((key, value) -> System.out.println(key + " -> " + value));

        System.out.println("=============================================================");

        counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        System.out.println("=============================================================");

        counts.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
