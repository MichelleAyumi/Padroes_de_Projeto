
import java.util.Random;

/**
 *
 * @author Ayumi
 */
public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    /*
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
    int count = 0;
    */
    GumballMachine gumballMachine;
    
    public HasQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }    
    
    public void insertedQuarter(){
        System.out.println("You can't insert another quarter");
    }
    
    public void ejectQuarter(){
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void turnCrank(){
        System.out.println("YOu turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount())){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else
            gumballMachine.setState(gumballMachine.getSoldState());
    }
    
    public void dispense(){
        System.out.println("No gumball dispensed");
    }
}
