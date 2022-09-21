
package pizzaria2;

public interface PizzaIngredientFactory {
    
//NYPizzaIngredientFactory
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
    
   
    //ChicagoPizzaIngredientFactory
    public Espinafre createEspinafre();
    public AzeitonaPreta createAzeitonaPreta();
    public FrozenClam createFrozenClam();
    public Calabresa createCalabresa();
    public Berinjela createBerinjela();
    public Mussarela createMussarela();
    public PlumTomatoSauce createPlumTomatoSauce();
    public ThickCrustDough createThickCrustDough();

}
