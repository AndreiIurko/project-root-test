import java.io.File; // Unused import
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ProblematicCode {

    private String name = "default"; // Field can be converted to a local variable

    public static void main(String args[]) { // Traditional C-style array declaration
        ProblematicCode instance = new ProblematicCode();
        instance.processData();
        instance.checkString("test");
    }

    public void processData() {
        List rawList = new ArrayList(); // Raw use of parameterized class 'ArrayList'
        Vector obsoleteVector = new Vector(); // 'Vector' is an obsolete collection

        rawList.add("item");
        obsoleteVector.add(1);

        String result = "";
        // Inefficient string concatenation in a loop
        for (int i = 0; i < 10; i++) { // '10' is a magic number
            result += i;
        }
        System.out.println("Result: " + result);
    }

    public boolean checkString(String input) {
        String testValue = new String("test"); // Redundant 'new String()' call

        // Strings are compared using '==' instead of '.equals()'
        if (input == testValue) {
            System.out.println("Strings match!");
            return true;
        }

        try {
            int numericValue = Integer.parseInt(input);
            System.out.println("Parsed value: " + numericValue);
        } catch (NumberFormatException e) {
            // Empty catch block
        }

        // The result of 'replace' is ignored
        input.replace('t', 'T');
        System.out.println("Modified string: " + input); // Will print the original string

        return false;
    }

    // This method is never used
    private void unusedHelperMethod() {
        System.out.println("This method is never called.");
    }
}

// Interface with redundant modifiers
interface SampleInterface {
    public void performAction(); // 'public' is redundant for interface methods
}
