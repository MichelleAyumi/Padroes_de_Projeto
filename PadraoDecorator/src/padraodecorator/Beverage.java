package padraodecorator;


public abstract class Beverage {
    String description = "Unknown Beverage";
    
    
    public String getDescription(){
        return description;
    }
    
    //public abstract double cost();
    double milkCost;
    double soyCost;
    double mochaCost;
    double whipCost;
    public double cost(){
        double condimentCost = (double) 0.0;
        
        if(hasMilk()){
            condimentCost += milkCost;
        }
        
        if(hasSoy()){
            condimentCost += soyCost;
        }
        
        if(hasMocha()){
            condimentCost += mochaCost;
        }
        
        if(hasWhip()){
            condimentCost += whipCost;
        }
        
        return condimentCost;
    }

    private boolean hasMilk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean hasSoy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean hasMocha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean hasWhip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
