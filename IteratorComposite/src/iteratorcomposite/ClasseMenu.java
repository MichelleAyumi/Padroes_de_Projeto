package iteratorcomposite;

import java.util.Hashtable;
import java.util.Iterator;

public class ClasseMenu implements Menu{
    Hashtable menuItems = new Hashtable();
    
    public CafeMenu(){
        addItem("Veggie Burguer and air fries", "Veggie burguer on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of soup the day, with a side salad", false, 6.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    }
    
    /*
    public Hashtable getItems(){
        return menuItems;
    }
*/
    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
}
