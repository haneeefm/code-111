package mooc.vandy.java4android.calculator.logic;

/**
 * Interface that is implemented by Add, Subtract and Multiply classes.
 */
public interface ArithmeticsInterace {
    /**
     * Method operate is common to Add, Subtract
     * and Multiply class. They all do single operation
     * This method will have different implementations
     * in different classes
     * @return an integer value of the arithmetic operation
     */
    int operate();
}
