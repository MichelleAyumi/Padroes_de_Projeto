package IMC;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Ayumi
 */
public class Nutricionista implements Observer {
    double altura;
    double peso;

    public void update(double peso, double altura) {
	this.peso = peso;
	this.altura = altura;
	show();
    }

    public String calculaImc() {
	double imc = (this.peso / Math.pow(this.altura, 2));
            String mensagem = "";
	if (imc < 18.5) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Abaixo do Peso";
	} else if (imc <= 24.9 || imc >= 18.5) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Peso normal";
	} else if (imc <= 29.9 || imc >= 25.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Pré-obesidade";
	} else if (imc <= 34.9 || imc >= 30.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 1";
        } else if (imc <= 39.9 || imc >= 35.0) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 2";
	} else if (imc >= 40) {
            mensagem = "IMC -> " + String.valueOf(imc) + " Obesidade Grau 3";
	}
            return mensagem;
	}

	public void show() {
            System.out.println("Vamos alterar sua dieta para melhor se adequar a seu IMC " + calculaImc());
	}

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
