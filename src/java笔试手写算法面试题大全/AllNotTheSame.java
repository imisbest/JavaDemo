package java笔试手写算法面试题大全;

/**
 * @author Administrator
 * 9.写一个算法判断一个英文单词的所有字母是否全都不同（不区分大小写）
 */
public class AllNotTheSame {
    public static void main(String[] args) {
        System.out.println(judge("hello"));
        System.out.print(judge("smile"));
    }

    public static boolean judge(String str) {
        String temp = str.toLowerCase();
        int[] letterCounter = new int[26];
        for (int i = 0; i < temp.length(); i++) {
            int index = temp.charAt(i) - 'a';
            letterCounter[index]++;
            if (letterCounter[index] > 1) {
                return false;
            }
        }
        return true;
    }
}
