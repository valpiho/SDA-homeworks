package homeworks.september_13.task4;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Parser {

    public static Person getPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your information");
        String personInfo = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?:\\b\\w+\\b[\\s]*){3}(?=\\d{2}/\\d{2}/\\d{4}$)");
        Matcher matcher = pattern.matcher(personInfo);

        if (!matcher.find()){
            System.out.println("You have entered wrong info. Try again with 'Firstname Lastname City 01/01/2000'");
            personInfo = scanner.nextLine();
        }

        String[] parsedList = personInfo.split(" ");
        int[] parsedDate = Arrays.stream(parsedList[parsedList.length-1]
                .split("/"))
                .flatMapToInt(num -> IntStream.of(Integer.parseInt(num)))
                .toArray();

        return new Person(
                parsedList[0],
                parsedList[1],
                parsedList[2],
                new GregorianCalendar(parsedDate[2], parsedDate[1], parsedDate[0]));
    }
}
