package mooc.vandy.java4android.calculator.logic;

import android.bluetooth.le.AdvertiseData;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Next four lines indicate constants that would be used
     * when necessary in this class. 1,2,3,4 values will be
     * used in Switch(int) values comparison.
     */
    private static final int ADDITION = 1;
    private static final int SUBTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        switch (operation){
            case ADDITION:
                Add newAdd = new Add(argumentOne, argumentTwo);
                mOut.print(newAdd.toString());
                break;
            case SUBTRACTION:
                Subtract newSubtraction = new Subtract(argumentOne, argumentTwo);
                mOut.print(newSubtraction.toString());
                break;
            case MULTIPLICATION:
                Multiply newMultiplication = new Multiply(argumentOne, argumentTwo);
                mOut.print(newMultiplication.toString());
                break;
            case DIVISION:
                Divide newDivision = new Divide(argumentOne, argumentTwo);
                mOut.print(newDivision.toString());
                break;
            default:
                System.out.println("Invalid Operator, choose valid operator from the list.");
        }
    }
}