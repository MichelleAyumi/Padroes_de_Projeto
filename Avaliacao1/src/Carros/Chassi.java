package Carros;
import java.util.Random;

/**
 *
 * @author Ayumi
 */
class Chassi {
    private int numero;
    
    public Chassi(){
        this.numero = new Random().nextInt(10000);
    }
}
