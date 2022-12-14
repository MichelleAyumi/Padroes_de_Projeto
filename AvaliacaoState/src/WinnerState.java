/**
 *
 * @author Ayumi
 */
public class WinnerState implements State {
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
   GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine){
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
        System.out.println("You're a winner! you get two gumballs for your quarter");
        
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Ooops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
