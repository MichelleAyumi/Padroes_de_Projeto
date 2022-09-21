package pizzaria2;

public class CaliforniaPizzaStore extends PizzaStore {
    
    protected Pizza createPizza (String item){
        
        if(item.equals("cheese")){
            return new CaliforniaStyleCheesePizza();
        }else if(item.equals("veggie")){
            return new CaliforniaStyleVeggiePizza();
        }else if(item.endsWith("clam")){
            return new CaliforniaStyleClamPizza();
        }else if(item.equals("pepperoni")){
            return new CaliforniaStylePepperoniPizza();
        }else{
            return null;
        }
        
    }
    
}
