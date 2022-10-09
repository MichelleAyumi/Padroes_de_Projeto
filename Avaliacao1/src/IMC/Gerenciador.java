
package IMC;

import java.util.ArrayList;
import java.util.Observer;



/**
 *
 * @author Ayumi
 */
public class Gerenciador implements Subject{
   private ArrayList<Observer> observers;

	public Gerenciador() {
		observers = new ArrayList<Observer>();
		// TODO Auto-generated constructor stub
	}

	public void registroObserver(Observer o) {
		observers.add(o);
	}

	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers(double peso, double altura) {
		observers.stream().forEach((o) -> {
			o.update(peso, altura);
		});
	}

	public void setMesurements(double peso, double altura) {
		notifyObservers(peso, altura);
	}

    @Override
    public void registroObserver(IMC.Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(IMC.Observer o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
