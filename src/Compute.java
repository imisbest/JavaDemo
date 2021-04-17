/**
 * @author Administrator
 */
public class Compute {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i < 999; i++) {
            System.out.println("sum1]" + sum);
            sum += i;
            System.out.println("【sum]" + sum);
            System.out.println("i]" + i);
        }
    }
}
