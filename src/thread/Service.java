package thread;

public class Service {
    public static void main(String[] args) {
        int n=5;
        System.out.println(foo(n));
    }
    static int foo(int n){
        if(n<2) {
            return n;
        }
        return foo(n - 1) + foo(n - 2);
    }
}
