package Carros;

/**
 *
 * @author Ayumi
 */
import java.util.Random;

public class Singleton {

    private static Singleton uniqueInstance;
    	private boolean canMake;
	private boolean hasMaterial;

	private Singleton() {
            canMake = true;
            hasMaterial = true;
	}

	public Carro makeRandomCarro() {

            if (!canMake || !hasMaterial) {
		return null;
            } else {
		canMake = false;
                return constructRandomCarro();
            }
        }
        
	private Carro constructRandomCarro() {
            Chassi chassi = new Chassi();
            Rodas rodas = new Rodas();
            Motor motor = new Motor();
            String name = "Carro numero " + new Random().nextInt(new Random().nextInt(99999));

            Carro carro = new Carro(name, chassi, rodas, motor);
            canMake = true;
		
            return carro;
	}
	
	public void refill() {
            if(hasMaterial) {
            	return;
            }else {}
		hasMaterial = true;
        }
	
	public static synchronized Singleton getInstance() {
            if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
            }
                return uniqueInstance;
        }
}
