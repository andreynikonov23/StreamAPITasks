package nick.pack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Из списка имен вывести количество имен начинающихся на букву 'J'
    Реализовать с помощью Stream API
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList();

        list.add("Jesse Pinkman");
        list.add("Walter White");
        list.add("Gustavo Fring");
        list.add("Jene Margolis");
        list.add("Saul Goodman");
        list.add("Mike Ehrmanttraut");
        list.add("Skyler White");
        list.add("Hank Shrader");


        int count = (int) list.stream().filter((x) -> x.startsWith("J")).count();
        System.out.println(count);
    }
}
