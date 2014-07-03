package com.example.dieta.utils;

public class Food {
	private String name;
	private String schedule;
	private int amount_main;
	private int amount_accompaniment;
	private String main_measure;
	private String accompaniment_measure;
	private int calories;
	private String clasification;

	public Food(String name, String schedule, int amount_main, int amount_accompaniment, String main_measure, String accompaniment_measure, int calories, String clasification) {
		this.name = name;
		this.schedule = schedule;
		this.amount_main = amount_main;
		this.amount_accompaniment = amount_accompaniment;
		this.main_measure = main_measure;
		this.accompaniment_measure = accompaniment_measure;
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
	
	public int getAmountMain() {
		return amount_main;
	}
	
	public void setAmountMain(int amount_main) {
		this.amount_main = amount_main;
	}
	
	public int getAmountAccompaniment() {
		return amount_accompaniment;
	}
	
	public void setAmountAccompaniment(int amount_accompaniment) {
		this.amount_accompaniment = amount_accompaniment;
	}
	
	public String getMainMeasure() {
		return main_measure;
	}
	
	public void setMainMeasure(String main_measure) {
		this.main_measure = main_measure;
	}
	
	public String getAccompanimentMeasure() {
		return accompaniment_measure;
	}
	
	public void setAccompanimentMeasure(String accompaniment_mesure) {
		this.accompaniment_measure = accompaniment_measure;
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
