import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");

        List<String> upperCase = colors.stream().map(String::toUpperCase).toList();
        List<String> lowerCase = colors.stream().map(String::toLowerCase).toList();
        System.out.println(upperCase);
        System.out.println(lowerCase);
    }
}
