package learn.leetcode;

/**
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * @author 执笔
 * @date 2019/9/11 13:44
 */
public class Solution_28 {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || needle.length() == 0) {
            return 0;
        }
        int length = haystack.length();
        int index  = 0;
        int ind    = 0;
        for (int i = 0; i < length; i++) {
            if (haystack.charAt(i) == needle.charAt(ind)) {
                if (ind == 0) {
                    index = i;
                }
                ind++;
            } else if (ind > 0) {
                ind = 0;
                i = index;
            }
            if (ind == needle.length()) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_28 solution1 = new Solution_28();
        System.out.println(solution1.strStr("hellollq", "llq"));
    }
}
