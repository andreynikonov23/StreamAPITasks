import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        initNums(nums);
        System.out.println(nums);
        System.out.println(nums.stream().mapToDouble(Integer::doubleValue).average().getAsDouble());
    }
    public static void initNums(List<Integer> nums) {
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * (100 - 1 + 1)) + 1;
            nums.add(num);
        }
    }
}
