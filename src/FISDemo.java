// Programme Name FISDemo.java

import java.io.FileInputStream;

public class FISDemo {
    public static void main(String args[]) {
        byte[] buf = new byte[2056];
        try {
            FileInputStream fileIn = new FileInputStream("C:\\Users\\Administrator\\Desktop\\公司地址.txt");
            int bytes = fileIn.read(buf, 0, 2056);
            String str = new String(buf, 0, bytes);
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}