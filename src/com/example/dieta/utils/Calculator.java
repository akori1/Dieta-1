package com.example.dieta.utils;

public class Calculator {
	private float imc;
	
	public Calculator(float weight, float stature) {
		imc = (float) (weight/Math.pow(stature, 2));
	}
	
	public float getImc() {
		return imc;
	}
	
	public int getClass(float imc) {
		if (imc < 16)
			return 0; //Delgadez severa
		else if (imc < 16.99)
			return 1; // Delgadez moderada
		else if (imc < 18.49)
			return 2; //Delgadez leve
		else if (imc < 24.99)
			return 3; //Normal: Dieta de nutricion para mantener peso
		else if (imc < 29.99)
			return 4; //Preobeso
		else if (imc < 34.99)
			return 5; //Obesidad leve
		else if (imc < 39.99)
			return 6; //Obesidad media
		else
			return 7; //Obesidad morbida
	}
}