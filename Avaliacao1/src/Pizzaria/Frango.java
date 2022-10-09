package Pizzaria;

/**
 *
 * @author Ayumi
 */
public abstract class Frango extends Decorator{
    Pizza pizza;

	
	
	public Frango(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public String getDescricao() {
            return this.pizza.getDescricao() + "Frango";
	}

	@Override
	public double cost() {
            return 10.50 + this.pizza.cost();
	}
}
