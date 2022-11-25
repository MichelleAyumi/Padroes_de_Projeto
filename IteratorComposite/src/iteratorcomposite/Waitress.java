package iteratorcomposite;

import java.awt.Menu;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList menus;
    
    public Waitress(ArrayList menus){
        this.menus = menus;
    }
    
    public void printMenu(){
        Iterator menuIterator = menus.iterator();
        while(menuIterator.hasNext()){
            Menu menu = (Menu)menuIterator.next();
            printMenu(menu.createIterator());
        }
    }
    
    void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + ", ");
            System.out.println(menuItem.getDescription());
        }
    }
    
    /*
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIteratir = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        System.out.println("MENU \n ----\n BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        System.out.println("\nDINNER");
        printMenu(cafeIterator);
    }
    
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuitem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + " ,");
            System.out.println(menuItem.getPrice() + " ,");
            System.out.println(menuItem.getDescription());
        }
    }
*/
}
