package learn.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 如果反转后整数溢出那么就返回 0。
 *
 * @author 执笔
 * @date 2019/9/11 15:54
 */
public class Solution_7_2 {
    public int reverse(int x) {
        StringBuilder builder = null;
        if (x > 0) {
            builder = new StringBuilder(String.valueOf(x)).reverse();
        } else {
            builder = new StringBuilder(String.valueOf(-x)).append("-").reverse();
        }
        try {
            return Integer.parseInt(builder.toString());
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution_7_2 solution1 = new Solution_7_2();
        System.out.println(solution1.reverse(1563847412));

    }
}
