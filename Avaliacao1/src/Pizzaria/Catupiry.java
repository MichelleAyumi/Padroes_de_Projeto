
package Pizzaria;

/**
 *
 * @author Ayumi
 */
public class Catupiry extends Decorator{
   Pizza pizza;

	public Catupiry(Pizza pizza) {
            this.pizza = pizza;
	}

	public String getDescricao() {
            return this.pizza.getDescricao() + " + Catupiry";
	}

	public double cost() {
            return 12.60 + this.pizza.cost();
	} 
}
