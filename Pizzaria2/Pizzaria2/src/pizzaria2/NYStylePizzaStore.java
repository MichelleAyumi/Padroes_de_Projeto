package pizzaria2;

public class NYStylePizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        
        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Pizza de queijo no estilo de Nova York");
        }else if(item.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Pizza vegetariana no estilo de Nova York");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Pizza de mariscos no estilo de Nova York");
        }else if(item.equals("pepperoni")){
           pizza = new PepperoniPizza(ingredientFactory);
           pizza.setName("Pizza de calabresa no estilo de Nova York");
        }
        return pizza;
    }
}
