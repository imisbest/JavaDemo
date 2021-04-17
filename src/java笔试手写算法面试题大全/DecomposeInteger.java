package java笔试手写算法面试题大全;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Administrator
 * 7.输入一个正整数，将其分解为素数的乘积。
 */
public class DecomposeInteger {
    private static List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        System.out.print("请输入一个数: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decomposeNumber(n);
        System.out.print(n + " = ");
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " * ");
        }
        System.out.println(list.get(list.size() - 1));
    }

    public static void decomposeNumber(int n) {
        if (isPrime(n)) {
            list.add(n);
            list.add(1);
        } else {
            doIt(n, (int) Math.sqrt(n));
        }
    }

    public static void doIt(int n, int div) {
        if (isPrime(div) && n % div == 0) {
            list.add(div);
            decomposeNumber(n / div);
        } else {
            doIt(n, div - 1);
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
