
import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;
    
   public PancakeHouseMenu(){
       menuItems = new ArrayList();
       
       addItem("K&B's Pancake BreakFast", "Pancakes with scrambled eggs and toast",true, 2.99);
       
       addItem("Regular Pancake Breakfast", "Pancakes with fried eggs sausage",false , 2.99);
       
       addItem("Blueberry Pancake", "Pancakes made with fresh blueberries" , true , 3.49);
       
       addItem("Waffes", "Waffles with youe choice of blueberries or strawberries", true , 3.59);   

   }
   
   public void addItem(String name, String description, boolean vegetarian, double price){
       MenuItem mi = new MenuItem(name, description, vegetarian, price);
       //MenuItem menuItem = new menuItem(name, description vegetarian,price);
       menuItems.add(mi);
   }
   
   public ArrayList getMenuItems(){
       return menuItems;
}
   



}
