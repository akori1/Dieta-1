package com.example.dieta;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dieta.utils.Food;
import com.example.dieta.utils.FoodAdapter;

public class Diet2 extends ActionBarActivity{

	private TextView textViewCalories;
	private ListView listViewFoods;

	private Food[] foods = new Food[2];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet2);        
        
        foods[0] = new Food("Comida1", "mañana", 100, 101, "m1", "am1", 1000, "carnes");
        foods[1] = new Food("Comida2", "tarde", 200, 201, "m2", "am2", 2000, "verduras");
        
        FoodAdapter adaptader = new FoodAdapter(this, foods);
        
        textViewCalories = (TextView)findViewById(R.id.calories);
        listViewFoods = (ListView)findViewById(R.id.foodList);
        
        listViewFoods.setAdapter(adaptader);
        
        listViewFoods.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
            	
            	String selectedOption = ((Food)a.getAdapter().getItem(position)).getName();
            	
            	textViewCalories.setText("Opción seleccionada: " + selectedOption);
            }
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.diet2, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}