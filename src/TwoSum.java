import java.util.Arrays;

/**
 * Created by zhangxinyu on 1/10/17.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        boolean found = false;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        return output;
    }

    public static void main(String arg[]) {
        int[] input = { 11, 5, 2, 7};
        int[] result = {2, 3};

        if (Arrays.equals(twoSum(input, 9), result)) {
            System.out.format("correct");
        } else {
            System.out.format("wrong");
        }
    }
}
