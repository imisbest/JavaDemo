package java笔试手写算法面试题大全;

public class GetWordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("string word"));
    }

    public static int wordCount(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            int ascii = Character.codePointAt(s, i);
            if (ascii >= 0 && ascii <= 255) {
                length++;
            } else {
                length += 2;
            }
        }
        return length;
    }
}
