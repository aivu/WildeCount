package WildeCount;

public class Counter {
    /**
     * @author Alina Vuong
     * created 8/21/15
     */
    
    public Counter(int start) {
        count = start;
        System.out.println(count);
    }

    public Counter() {
        Counter(0);
    }

    private void update(int n) {
        count += n;
        System.out.print("\r"+count);
    }

    private int count;
}