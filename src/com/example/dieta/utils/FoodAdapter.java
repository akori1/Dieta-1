package com.example.dieta.utils;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.dieta.R;

public class FoodAdapter extends ArrayAdapter<Food> {
	
	Activity context;
	Food[] foods;
	
	public FoodAdapter(Activity context, Food[] foods) {
		super(context, R.layout.listitem_food, foods);
		this.context = context;
		this.foods = foods;
	}
	
	public View getView(int position, View convertView, ViewGroup parent) 
	{
		View item = convertView;
		ViewHolder holder;
		
		if(item == null)
		{
			LayoutInflater inflater = context.getLayoutInflater();
			item = inflater.inflate(R.layout.listitem_food, null);
			
			holder = new ViewHolder();
			holder.name = (TextView)item.findViewById(R.id.name);
			holder.schedule = (TextView)item.findViewById(R.id.schedule);
			holder.amount_main = (TextView)item.findViewById(R.id.amount_main);
			holder.amount_accompaniment = (TextView)item.findViewById(R.id.amount_accompaniment);
			holder.main_measure = (TextView)item.findViewById(R.id.main_measure);
			holder.accompaniment_measure = (TextView)item.findViewById(R.id.accompaniment_measure);
			holder.calories = (TextView)item.findViewById(R.id.calories);
			holder.clasification = (TextView)item.findViewById(R.id.clasification);
			
			item.setTag(holder);
		}
		else
		{
			holder = (ViewHolder)item.getTag();
		}

		holder.name.setText(foods[position].getName());
		holder.schedule.setText(foods[position].getSchedule());
		holder.amount_main.setText("" + foods[position].getAmountMain());
		holder.amount_accompaniment.setText("" + foods[position].getAmountAccompaniment());
		holder.main_measure.setText(foods[position].getMainMeasure());
		holder.accompaniment_measure.setText(foods[position].getAccompanimentMeasure());
		holder.calories.setText("" + foods[position].getCalories());
		holder.clasification.setText(foods[position].getClasification());

		return(item);
	}

	static class ViewHolder {
		TextView name;
		TextView schedule;
		TextView amount_main;
		TextView amount_accompaniment;
		TextView main_measure;
		TextView accompaniment_measure;
		TextView calories;
		TextView clasification;
		
	}
}