public class J3 {
    public static void main(String[] args) {
        try {
            int sumAll = 0;
            for (int i = 1; i <= 1000; i++) {
                int sum = 1;
                for (int j = 1; j <= i; j++) {
                    sum *=j;
                    if (sum >= 2147483647 / 2) {
                        throw new RuntimeException();
                    }
                }
                sumAll += sum;
                System.out.println("总和是】"+sumAll+"[sum]"+sum);
            }
        } catch (RuntimeException e) {
        }

    }
}
