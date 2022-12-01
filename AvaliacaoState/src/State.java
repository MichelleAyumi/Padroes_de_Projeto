/**
 *
 * @author Ayumi
 */
public interface State {
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    public void dispense();

    public void turnCrank();

    public void ejectQuarter();

    public void insertQuarter();
}
