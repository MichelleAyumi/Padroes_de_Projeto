
import java.io.IOException;

public class CoffeeWithHook extends CaffeineBeverageWithHook{
    
    public void brew(){
        System.out.println("Dripping Coffe through filter");
    }
    
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
    
    public boolean customerWantsCondiments(){
        String answer = getUserInput();
        
        return answer.toLowerCase().startsWith("y");
    }   
    
    private String getUserInput(){
        String answer = null;
        
        System.out.println("Would you like milk and sugar with your coffee (y/n)?");
        BufferedReader in = new BufferedReader(new inputStreamReader(System.in));
        
        answer = in.readLine();
        
        if(answer == null){
            return "no";
        }
        
        return answer;
    }    
}
