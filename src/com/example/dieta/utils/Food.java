package com.example.dieta.utils;

public class Food {
	private String name;
	private String schedule;
	private int amount_main;
	private int amount_accompaniment;
	private String main_measure;
	private String accompaniment_mesure;
	private int calories;
	private String clasification;

	public Food(String name, String schedule, int amount_main, int amount_accompaniment, String main_measure, String accompaniment_measure, int calories, String clasification) {
		this.name = name;
		this.schedule = schedule;
		this.amount_main = amount_main;
		this.amount_accompaniment = amount_accompaniment;
		this.main_measure = main_measure;
		this.accompaniment_mesure = accompaniment_measure;
		this.calories = calories;
		this.clasification = clasification;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSchedule() {
		return schedule;
	}
	
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	public int getAmount_main() {
		return amount_main;
	}
	
	public void setAmount_main(int amount_main) {
		this.amount_main = amount_main;
	}
	
	public int getAmount_accompaniment() {
		return amount_accompaniment;
	}
	
	public void setAmount_accompaniment(int amount_accompaniment) {
		this.amount_accompaniment = amount_accompaniment;
	}
	
	public String getMain_measure() {
		return main_measure;
	}
	
	public void setMain_measure(String main_measure) {
		this.main_measure = main_measure;
	}
	
	public String getAccompaniment_mesure() {
		return accompaniment_mesure;
	}
	
	public void setAccompaniment_mesure(String accompaniment_mesure) {
		this.accompaniment_mesure = accompaniment_mesure;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public String getClasification() {
		return clasification;
	}
	
	public void setClasification(String clasification) {
		this.clasification = clasification;
	}
}
