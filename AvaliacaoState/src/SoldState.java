/**
 *
 * @author Ayumi
 */
public class SoldState implements State{
    /*
    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;
    */
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
   GumballMachine gumballMachine;
    
    public SoldState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter(){
        System.out.println("Please wait, we're already giving you a gumball");
    }
    
    public void ejectQuarter(){
        System.out.println("Sorry, you already turned the crank");
    }
    
    public void turnCrank(){
        System.out.println("Turning twice doesn't get you another gumball!");
    }
    
    public void dispense(){
        gumballMachine.releaseBall();
        
        if(gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Ooops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
