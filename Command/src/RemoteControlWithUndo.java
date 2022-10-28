public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;
    
    public RemoteControlWithUndo(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        
       Command noCommand = new NoCommand();
       
       for(int i = 0 ; i < 7 ; i++){
           onCommands[i] = noCommand;
           offCommands[i] = noCommand;
        }
       undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
    
    public String toString(){
        return null;
        //Código string
    }

    void setCommand(int i, CeilingFanMediumCommand ceilingFanMedium, CeilingFanOffCommand ceilingFanOff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCommand(int i, CeilingFanHighCommand ceilingFanHigh, CeilingFanOffCommand ceilingFanOff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
