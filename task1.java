package nick.pack;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
    Создать список из 15 эл-ов и вывести в консоль все четные элементы.
    Реализовать с помощью Stream API.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        
        for (int i=0; i < 14; i++){
            int random = (int) (Math.random() * ((50 - 1) + 1) + 1);
            list.add(random);
        }
        System.out.println(list);
        
        
        list.stream().filter(x -> x%2 == 0).forEach(System.out::println);
    }
}
