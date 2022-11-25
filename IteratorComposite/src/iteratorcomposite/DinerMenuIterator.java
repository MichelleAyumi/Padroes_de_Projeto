package iteratorcomposite;

import static java.nio.file.Files.list;
import static java.util.Collections.list;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] list){
        this.list = list;
    }
    
    public Object next(){
        MenuItem menuItem = items[position];
        position ++;
        return menuItem;
    }
    
    public boolean hasNext(){
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }
    
    public void remove(){
        if(position <= 0){
            throw new IllegalStateException("You can't remove an item until you've done at least one next()");
        }
        
        if(list[position-1] != null){
            for(int i = position-1; i< (list.lenght-1); i++){
                list[i] = list[i+1];
            }
            
            list[list.lenght-1] == null;
        }
    }
}
