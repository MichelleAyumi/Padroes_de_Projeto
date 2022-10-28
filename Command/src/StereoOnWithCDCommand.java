public class StereoOnWithCDCommand implements Command{
    Stereo stereo;
    
    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }
    
    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
