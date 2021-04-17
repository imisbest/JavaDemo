import java.util.Scanner;

public class J5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串1");
        String sin1 = sc.nextLine();
        System.out.println("请输入字符串2");
        String sin2 = sc.nextLine();
        System.out.println("字符串相加结果】" + str(sin1, sin2));
        System.out.println("整数相加结果】" + str(Integer.parseInt(sin1), Integer.parseInt(sin2)));
        System.out.println("浮点数相加结果】" + str(Float.parseFloat(sin1),Float.parseFloat(sin2)));

    }
    static String str(String st1, String st2){
        return st1+st2;
    }
    static String str(int st1,int st2){
        return String.valueOf(st1 + st2);
    }
    static String str(float str1, float str2){
        return String.valueOf(str1 + str2);
    }
}
