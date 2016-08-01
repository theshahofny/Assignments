package com.tiy.ssa.weekone.assignmentone;


public class Thermometer {

	int temperature;
	boolean isFahrenheit;

	public Thermometer(int temperature){
		this(temperature, true);
	}


	public Thermometer(int temperature, boolean isFahrenheit) {
		super();
		this.temperature = temperature;
		this.isFahrenheit = isFahrenheit;
	}


	public int display(boolean isFahrenheit){
		if (this.isFahrenheit == isFahrenheit)
				return temperature;
		if(this.isFahrenheit)
			return fahrenheitToCelcius(temperature);
		return celciusToFahrenheit(temperature);
	}


	public int fahrenheitToCelcius(int temperature){
		return (int) Math.round((temperature - 32.0)/ 1.8);
	}

	public int celciusToFahrenheit(int temperature){
		return (int) Math.round(temperature * 1.8 + 32);
	}
}
