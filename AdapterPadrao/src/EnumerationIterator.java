public class EnumerationIterator implements Iterator{
    Enumeration enum;
    
    public EnumerationIterator(Enumeration enum){
        this.enum = enum;
    }
    
    public boolean hasNext(){
        return enum.hasMoreElements();
    }
    
    public Object next(){
        return enumnestElements();
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }

    private Object enumnestElements() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
