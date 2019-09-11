package learn.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * @author 执笔
 * @date 2019/9/11 13:44
 */
public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        int[]                 arr = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(target - num)) {
                arr[0] = i;
                arr[1] = map.get(target - num);
                break;
            }
            map.put( num, i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution_1 solution1 = new Solution_1();
        int[]      ints      = solution1.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ints[0] + " " + ints[1]);
    }
}
