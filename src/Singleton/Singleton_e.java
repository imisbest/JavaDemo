package Singleton;

public class Singleton_e {
    private Singleton_e() {

    }

    private static Singleton_e instance = null;

    public static synchronized Singleton_e getInstance() {
        if (instance == null) {
            instance = new Singleton_e();
        }
        return instance;
    }
}
