package pizzaria2;


public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
   
    public Dough createDough () {
        return new ThickCrustDough ();
    }

    public Sauce createSauce () {
	return new PlumTomatoSauce ();
    }
    
    public Cheese createCheese () {
        return new Mussarela ();
    }
    
    public Veggies [] createVeggies () {
        Veggies veggies [] = { new AzeitonaPreta(), new Espinafre(), new Berinjela()};
        return veggies;
    }

    public Pepperoni createPepperoni () {
        return new Calabresa ();
    }

    public Clam createclam () {
        return new FrozenClam ();
    }

    @Override
    public Clam createClam() {
        return null;
    }

    @Override
    public Espinafre createEspinafre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public AzeitonaPreta createAzeitonaPreta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public FrozenClam createFrozenClam() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Calabresa createCalabresa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Berinjela createBerinjela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mussarela createMussarela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlumTomatoSauce createPlumTomatoSauce() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ThickCrustDough createThickCrustDough() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
