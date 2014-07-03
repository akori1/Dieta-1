package com.example.dieta.utils;

import java.util.ArrayList;

public class Diet {
	private String name;
	private boolean weight; //0 Bajar, 1 Subir
	ArrayList<Food> foodList = new ArrayList<Food> ();
	
	public Diet(String name, boolean weight) {
		this.name = name;
		this.weight = weight;
		this.foodList = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void setText(String name) {
		this.name = name;
	}
	
	public boolean isWeight() {
		return weight;
	}
	
	public void setWeight(boolean weight) {
		this.weight = weight;
	}

}
