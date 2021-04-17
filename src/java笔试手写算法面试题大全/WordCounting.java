package java笔试手写算法面试题大全;

import java.io.FileReader;

/**
 * @author Administrator
 * 1.统计一篇英文文章单词个数。
 */
public class WordCounting {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\a.txt")) {
            int counter = 0;
            boolean state = false;
            int currentChar;
            while ((currentChar = fr.read()) != -1) {
                if (currentChar == ' ' || currentChar == '\n'
                        || currentChar == '\t' || currentChar == '\r') {
                    state = false;
                } else if (!state) {
                    state = true;
                    counter++;
                }
            }
            System.out.println(counter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}