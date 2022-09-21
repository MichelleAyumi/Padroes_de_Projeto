package fabricachocolate;

/*
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    
    //outras variaveis de instancia uteis aqui
    
    private Singleton(){}
    
    /*
    public static synchronized Singleton getInstance(){
        
        if(uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    
    public static Singleton getInstance(){
        return uniqueInstance;
    }

    //outros metodos uteis aqui
}
*/

//A palavra chave volatile garante que varios segmentos lidem com a variavel uniqueInstance
//corretamente quando esta sendo inicializada para a instancia singleton
public class Singleton{
    private volatile static Singleton uniqueInstance;
    
    private Singleton(){}
    
    public static Singleton getInstance(){
        if(uniqueInstance == null){
            synchronized(Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
