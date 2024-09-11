import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        initNums(nums);
        System.out.println(nums);

        int oddSum = nums.stream().filter(x -> x%2 != 0).flatMapToInt(IntStream::of).sum();
        int evenSum = nums.stream().filter(x -> x%2 == 0).flatMapToInt(IntStream::of).sum();
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
    public static void initNums(List<Integer> nums) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (100 - 1 + 1)) + 1;
            nums.add(num);
        }
    }
}
