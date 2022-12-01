/**
 *
 * @author Ayumi
 */
public class NoQuarterState implements State{
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
     State state = soldOutState;
    int count = 0;
    
    GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter(){
        System.out.println("You can't insert another quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
    
    public void ejectQuarter(){
        System.out.println("You haven't inserted a quarter");    
    }
    
    public void turnCrank(){
        System.out.println("You turned, but there are no gumballs");
    }
    
    public void dispense(){
        System.out.println("You need to pay first");
    }    
}
