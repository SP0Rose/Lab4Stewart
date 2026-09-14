public class Task1 {
    static void main(String[] args) {
        // Int variables
        int intOperandA = 82;
        int intOperandB = 19;
        int intSum = intOperandA + intOperandB;
        int intDifference = intOperandA - intOperandB;
        int intProduct = intOperandA * intOperandB;
        int intQuotient = intOperandA / intOperandB;
        int intModulo = intOperandA % intOperandB;

        // Double variables
        double doubleOperandA = 12.9;
        double doubleOperandB = 9.8;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB;
        double doubleModulo = doubleOperandA % doubleOperandB;

        // Int outputs
        System.out.println("The sum of intOperandA and intOperandB is " + intSum);
        System.out.println("The difference of intOperandA and intOperandB is " + intDifference);
        System.out.println("The product of intOperandA and intOperandB is " + intProduct);
        System.out.println("The quotient of intOperandA and intOperandB is " + intQuotient);
        System.out.println("The modulo of intOperandA and intOperandB is " + intModulo);

        System.out.println();

        // Double outputs
        System.out.println("The sum of intOperandA and intOperandB is " + doubleSum);
        System.out.println("The difference of intOperandA and intOperandB is " + doubleDifference);
        System.out.println("The product of intOperandA and intOperandB is " + doubleProduct);
        System.out.println("The quotient of intOperandA and intOperandB is " + doubleQuotient);
        System.out.println("The modulo of intOperandA and intOperandB is " + doubleModulo);
    }
}