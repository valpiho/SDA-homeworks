package homeworks.september_13.task3;

import homeworks.september_13.task2.Item;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("MOCK_DATA.csv");
        List<String> stringsList = new ArrayList<>();
        List<Person> objectsList;

        try (Stream<String> lineStream = Files.lines(path)) {
            stringsList = lineStream.collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("File is not exist");
        }

        objectsList = stringsList.stream()
                .map(e -> new Person(e.split(",")[0],
                        e.split(",")[1],
                        e.split(",")[2],
                        e.split(",")[3],
                        Gender.valueOf(e.split(",")[4].toUpperCase()),
                        e.split(",")[5]))
                .collect(Collectors.toList());

        objectsList.forEach(System.out::println);
    }
}
