package IMC;


public class Clinica {
   public static void main(String[] args) {
	
	Gerenciador pm = new Gerenciador();
	
	pm.registroObserver(new Paciente());
	pm.registroObserver(new Medico());
	pm.registroObserver(new Nutricionista());
	
	pm.setMesurements(80.0, 1.72);
	
} 
}
