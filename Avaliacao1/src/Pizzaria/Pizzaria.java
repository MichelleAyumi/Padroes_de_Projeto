package Pizzaria;

/**
 *
 * @author Ayumi
 */
import Pizzaria.CheesePizza;

public class Pizzaria {
    public static void main(String[] args) {
        Decorator decorator1 = new Catupiry(new CheesePizza());
	Decorator decorator2 =  new Cogumelo(decorator1);
	Decorator decorator3 = new Frango(decorator2) {};
	Decorator decorator4 = new Catupiry(new WhiteSaucePizza());
		
	System.out.println(decorator1.getDescricao() + " " + decorator1.cost());
	System.out.println(decorator2.getDescricao() + " " + decorator2.cost());
	System.out.println(decorator3.getDescricao() + " " + decorator3.cost());
	System.out.println(decorator4.getDescricao() + " " + decorator4.cost());
			
    }
}
