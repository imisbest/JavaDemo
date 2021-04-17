package Singleton;

public class SequenceGenerator {
    private int count = 0;

    public synchronized int getSequence() {
        ++count;
        return count;
    }

    private SequenceGenerator() {

    }

    private final static SequenceGenerator instance=new SequenceGenerator();

    public static SequenceGenerator getInstance() {
        return instance;
    }

}
