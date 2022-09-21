package pizzaria;


public class PizzaTestDrive {
    public static void main (String[] args){
        
	PizzaStore nyStore = new NYPizzaStore();
	PizzaStore chicagoStore = new ChicagoPizzaStore();

	Pizza pizza = nyStore.orderPizza("cheese");
	System.out.println("Ethan orded a " + pizza.getName() +  " \n ");

	pizza = chicagoStore.orderPizza("cheese");
	System.out.println("Joel orded a " + pizza.getName() +  " \n ");

    }
}
