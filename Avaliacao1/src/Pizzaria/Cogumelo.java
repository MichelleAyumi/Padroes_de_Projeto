package Pizzaria;

/**
 *
 * @author Ayumi
 */
public class Cogumelo extends Decorator{
    Pizza pizza;

	public Cogumelo(Pizza pizza) {
            this.pizza = pizza;
	}

	public String getDescription() {
            return this.pizza.getDescricao() + "Cogumelo";
	}

	public double cost() {
            return 4.5 + this.pizza.cost();
	}

    @Override
    public String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
