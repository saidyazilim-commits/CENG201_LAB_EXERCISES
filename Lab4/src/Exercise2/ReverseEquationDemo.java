package Exercise2;

/**
 * ReverseEquationDemo.java
 */
public class ReverseEquationDemo {

    public static void main(String[] args) {

        String[] equations = {
                "20-3+5*2",
                "123+45*6",
                "100/25-7"
        };

        System.out.println("========== EQUATION REVERSE TEST ==========");

        // Print the input and output like in the expected output
        for (String equation : equations) {
            String reversed = EquationReverser.reverseEquation(equation);
            System.out.println("Input:  " + equation);
            System.out.println("Output: " + reversed);
            System.out.println();
        }
    }
}