package learn.leetcode;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
 *
 * @author 执笔
 * @date 2019/9/11 15:54
 */
public class Solution_9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x == Integer.reverse(x)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution_9 solution1 = new Solution_9();
        System.out.println(solution1.isPalindrome(1563847412));
        System.out.println(solution1.isPalindrome(121));

    }
}
