package java笔试手写算法面试题大全;

/**
 * @author Administrator
 * 11.给一个数组，其中有一个重复元素占半数以上，找出这个元素。
 */
public class FindMost {
    public static void main(String[] args) {
        String[] strs = {"hello", "kiss", "hello", "hello", "maybe"};
        System.out.println(find(strs));
    }

    public static <T> T find(T[] x) {
        T temp = null;
        for (int i = 0, nTimes = 0; i < x.length; i++) {
            if (nTimes == 0) {
                temp = x[i];
                nTimes = 1;
            } else {
                if (x[i].equals(temp)) {
                    nTimes++;
                } else {
                    nTimes--;
                }
            }
        }
        return temp;
    }
}

