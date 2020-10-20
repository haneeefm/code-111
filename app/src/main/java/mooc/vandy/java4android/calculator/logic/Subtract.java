package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements ArithmeticsInterace{
    /**
     * First Argument of operate
     */
    private int firstArgument;

    /**
     * Second Argument of operate
     */
    private int secondArgument;

    /**
     * Class constructor that initialize fields with
     * passed values in parameters
     * @param firstArgument value of firstArgument
     * @param secondArgument  value of secondArgument
     */
    public Subtract(int firstArgument, int secondArgument){
        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
    }

    /**
     * Helper method that calculate difference of two numbers
     * @return the difference of class fields
     */
    public int operate(){
        return firstArgument - secondArgument;
    }

    /**
     * Overridden method toString() uses operate() method
     * and convert its value to string using static method
     * valueOf(int) from String Class.
     * @return the generated string to callee
     */
    public String toString(){
        return String.valueOf(operate());
    }
}
