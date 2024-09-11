import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        initNums(nums);
        System.out.println(nums);

        int max = nums.stream().flatMapToInt(IntStream::of).max().getAsInt();
        int min = nums.stream().flatMapToInt(IntStream::of).min().getAsInt();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
    public static void initNums(List<Integer> nums) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (100 - 1 + 1)) + 1;
            nums.add(num);
        }
    }
}
