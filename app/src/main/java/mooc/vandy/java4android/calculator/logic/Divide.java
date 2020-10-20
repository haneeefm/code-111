package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    /**
     * Variable to hold numerator Value of division
     */
    private int numerator;

    /**
     * Variable that hold denominator value of division
     */
    private int denominator;

    /**
     * Class constructor that initialize fields with
     * passed values in parameters
     * @param numerator value of numerator
     * @param denominator  value of denominator
     */
    public Divide(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Helper method that find Quotient of integer Division
     * @return -1 if denominator is zero, otherwise return
     *         integer division value.
     */
    private int integerDivision(){
        // Local variable to store division result
        int divisionResult;

        // Try if exception occurs due to division by zero
        try{
            divisionResult = numerator/denominator;
        }
        // If it occurs, return -1
        catch (ArithmeticException arithmeticException){
            return -1;
        }
        return divisionResult;
    }

    /**
     * Helper method to find Integer Reminder
     * @return return reminder of two values
     */
    private int integerReminder(){
        return numerator % denominator;
    }

    /**
     * Overridden method toString() uses integerDivision() method
     * to find if denominator is zero, if it is then it prompts to
     * user a message, otherwise print Quotient and Reminder in
     * desired format.
     * @return desired string value based on if-else structure.
     */
    public String toString(){
        if (integerDivision() == -1 && denominator == 0){
            return "Value Two could not be zero. It goes to denominator.";
        }
        else
            return integerDivision() + " R: " + integerReminder();
    }
}
