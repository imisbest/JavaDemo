package java笔试手写算法面试题大全;

import java.util.Arrays;

/**
 * @author Administrator
 * 10.有一个已经排好序的整数数组，其中存在重复元素，请将重复元素删除掉，
 * 例如，A= [1, 1, 2, 2, 3]，处理之后的数组应当为A= [1, 2, 3]。
 */
public class RemoveDuplication {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3};
        a = removeDuplicates(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] removeDuplicates(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[index] != a[i]) {
                a[++index] = a[i];
            }
        }
        int[] b = new int[index + 1];
        System.arraycopy(a, 0, b, 0, b.length);
        return b;
    }
}
