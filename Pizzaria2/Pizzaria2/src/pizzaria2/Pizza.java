package pizzaria2;


public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    
    abstract void prepare();
    
    void bake(){
        System.out.println("Assar por 25 minutos a 350º ");
    }
    
    void box(){
        System.out.println("Cortar a pizza em fatias diagonais ");
    }
    
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return null;
        //código para imprimir a pizza aqui
    }

}
