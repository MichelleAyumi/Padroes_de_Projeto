public class WinnerState implements State{
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
    State state = soldState;
    int count = 0;
    
    public void dispense(){
        System.out.println("You're a winner! You get two gumballs for your quarter");
        
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
    }else{
            gumballMachine.releaseBall();
            
            if(gumballMachine.getCount()>0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Opss, out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}