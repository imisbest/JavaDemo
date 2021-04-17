package Singleton;

public class Sinlgeton_bao {
    private Sinlgeton_bao() {

    }

    private final static Sinlgeton_bao instance = new Sinlgeton_bao();

    public static Sinlgeton_bao getInstance() {
        return instance;
    }
}
