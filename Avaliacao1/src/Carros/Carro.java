package Carros;

/**
 *
 * @author Ayumi
 */
public class Carro {
    String name; 
    Chassi chassi;
    Rodas rodas;
    Motor motor;
    
    public Carro(String name, Chassi chassi, Rodas roda, Motor motor) {
        super();
        this.name = name;
        this.chassi = chassi;
        this.rodas = rodas;
        this.motor = motor;
    }
    
    public String getName() {
	return name;
    }
    
    public void setName(String string) {
	this.name = string;
    }

    public Chassi getChassi() {
	return chassi;
    }

    public void setChassi(Chassi chassi) {
	this.chassi = chassi;
    }

    public Rodas getRodas() {
        return rodas;
    }

    public void setRodas(Rodas rodas) {
	this.rodas = rodas;
    }

    public Motor getMotor() {
	return motor;
    }

    public void setMotor(Motor motor) {
    	this.motor = motor;
    }

  

    
    
}
