import java.io.FileInputStream;
import java.io.IOException;

public class J6 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\公司地址.txt");

        System.out.println(fileInputStream.read());
    }
}
