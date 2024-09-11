import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        initNums(nums);
        System.out.println(nums);

        nums.stream().sorted().limit(2L).forEach(System.out::println);
    }
    public static void initNums(List<Integer> nums) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (100 - 1 + 1)) + 1;
            nums.add(num);
        }
    }
}
