import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List < String > list = Arrays.asList("KKf", "Lfd", "Psdfksd", "Lsdfkd", "Adsfkv", "Yrdsfs", "Kasaee", "Lsdfdr", "Psdfkds", "Lmsdmgf");
        Scanner scanner = new Scanner(System.in);
        String ch = scanner.next();

        long res = list.stream().filter(x -> x.startsWith(ch)).count();
        System.out.println(res);
    }
}
