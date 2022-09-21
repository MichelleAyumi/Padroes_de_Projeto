package pizzaria2;

public class NYPizzaStore extends PizzaStore{
    
     protected Pizza createPizza (String item){
        
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza();
        }else if(item.endsWith("clam")){
            return new NYStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }else{
            return null;
        }
        
    }
    
}
