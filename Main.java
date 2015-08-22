package WildeCount;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author Alina Vuong
 * created 8/21/15
 */
public class Main {
    private static final String version = "0.0.0";
    public static void main(String[] args) {
        static
        Scanner s = new Scanner(System.in);
        Counter counter = new Counter();
        Interpreter interpreter = new Interpreter(s, counter);
        System.out.printf("\n============= WILDECOUNT: OCCUPANCY COUNTER VERSION %s =============\n", version);
        System.out.print("> ");
        while (true) {
            if(!interpreter.command()) {
                break;
            }
        }
    }
}