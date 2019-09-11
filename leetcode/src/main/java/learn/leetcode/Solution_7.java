package learn.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 如果反转后整数溢出那么就返回 0。
 *
 * @author 执笔
 * @date 2019/9/11 15:54
 */
public class Solution_7 {
    public int reverse(int x) {
        int      result = 0;
        int      j      = 0;
        String[] arr    = String.valueOf(x).split("");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && "-".equals(arr[0])) {
                j = 1;
                continue;
            }
            String str = arr[i];
            if (Integer.parseInt(str) > (double) ((2147483647 - result) / Math.pow(10, i - j))) {
                return 0;
            }
            result += Integer.parseInt(str) * Math.pow(10, i - j);
        }
        if ("-".equals(arr[0])) {
            result = -result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution_7 solution1 = new Solution_7();
        System.out.println(solution1.reverse(1563847412));

    }
}
