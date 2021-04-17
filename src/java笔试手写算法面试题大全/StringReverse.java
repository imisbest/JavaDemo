package java笔试手写算法面试题大全;

/**
 * @author Administrator
 * 6.用递归实现字符串倒转
 */
public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hello world"));
    }

    public static String reverse(String originStr) {
        if (originStr == null || originStr.length() == 1) {
            return originStr;
        }
        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
