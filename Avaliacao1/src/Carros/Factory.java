package Carros;

/**
 *
 * @author Ayumi
 */
public class Factory {
    public static void main(String [] args){
        Singleton CarroSingleton = Singleton.getInstance();
        
        Carro carro = CarroSingleton.makeRandomCarro();
        
        System.out.println(carro.name);
    }
}
