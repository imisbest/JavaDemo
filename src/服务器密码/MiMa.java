package 服务器密码;

import java.util.UUID;

public class MiMa {
    public static void main(String[] args) {
        String[] m1 = {"a", "b", "c", "d", "e", "f", "g", "h",
                "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] m2 = {"A", "B", "C", "D", "E", "F", "G", "H",
                "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String[] m3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] m4 = {"!", "@", "#", "$", "%", "^", "*", "(", ")"};
        String mima = "";
        for (int i=1;i<=8;i++){
            mima+=m1[(int) (Math.random()*(m1.length))];
            mima+=m2[(int) (Math.random()*(m2.length))];
            mima+=m3[(int) (Math.random()*(m3.length))];
            mima+=m4[(int) (Math.random()*(m4.length))];
        }
        System.out.println(mima);//cM2(oZ2(rB9^kO7@bL9#fZ4!hX9(jL3%

        System.out.println(UUID.randomUUID().toString().length());
    }
}
