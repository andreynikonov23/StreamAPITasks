import java.util.*;

public class Main {
    public static void main(String[] args) {
        List < String > list = Arrays.asList("KKf", "Lfd", "Psdfksd", "Lsdfkd", "Adsfkv", "Yrdsfs", "Kasaee", "Lsdfdr", "Psdfkds", "Lmsdmgf");
        List<String> sortedList = new ArrayList<>(list.stream().sorted().toList());
        System.out.println(sortedList);
        Collections.reverse(sortedList);
        System.out.println(sortedList);
    }
}
