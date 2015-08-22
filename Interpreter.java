package WildeCount;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Takes input from the command line to run the specified commands.
 *
 * Created by vuonga on 8/21/15.
 */

public class Interpreter {

    public Interpreter(Scanner scanner, Counter counter) {
        input = scanner;
        Counter = counter;
    }

    boolean command() {
        System.out.print("> ");
        String next = input.next();
        switch (next) {
            case ("help"):
                helpStatement();
                break;
            case ("+"):
                interpret("+");
                break;
            case ("-"):
                interpret("-");
                break;
            case ("quit"):
            case ("exit"):
                exitStatement();
                return false;
            default:
                errorStatement();
                break;
        }
        return true;

    }

    void interpret() {
        if(input.hasNextLine()) {
            String[] line = input.nextLine().trim().split("[\\s\t]+");
            ArrayList<String> args = new ArrayList<String>();
            args.addAll(new ArrayList<String>(Arrays.asList(line)));
            interpret(args);
        } else {
            errorStatement();
        }
    }

    void interpret(ArrayList<String> args) {
        if (args.size() > 0) {
        } else {
            errorStatement();
        }
    }


    void errorStatement() {
        System.out.println("\nERROR: Invalid command or syntax.");
        helpStatement();
    }

    void helpStatement() {
        System.out.println("\thelp\t\t\t\t\t See this message");
        System.out.println();
    }

    void exitStatement() {
        System.out.println("Exiting.");
    }

    Counter Counter;
    Scanner input;
}