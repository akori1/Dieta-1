package com.example.dieta.utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBase extends SQLiteOpenHelper {
	String sqlCreateDiets = "CREATE TABLE Diet (name TEXT, weight BOOLEAN)"; //0 = Bajar, 1 = Subir
	String sqlCreateDietsFoods = "CREATE TABLE DietFood(diet_id INTEGER, food_id INTEGER, " +
			"PRIMARY KEY(diet_id) REFERENCES Diet(ROWID), " +
			"PRIMARY KEY(food_id) REFERENCES Food(ROWID)";
	String sqlCreateFoods = "CREATE TABLE Food (name TEXT, calories INTEGER, " +
			"amount_main INTEGER, main_measure INTEGER, " +
			"amount_accompaniment INTEGER, accompaniment_measure INTEGER, " +
			"schedule_id INTEGER, " +
			"FOREIGN KEY(main_measure) REFERENCES Measure(measure_id), FOREIGN KEY(accompaniment_measure) REFERENCES Measure(measure_id), " +
			"FOREIGN KEY(schedule_id) REFERENCES Schedule(schedule_id)";
	String sqlCreateSchedules = "CREATE TABLE Schedule (schedule_id INTEGER PRIMARY KEY, name TEXT)";
	String sqlCreateMeasures = "CREATE TABLE Measure (measure_id INTEGER PRIMARY KEY, name TEXT)";
	String sqlDelete = "DROP TABLE IF EXISTST Diet, Food, DietFood, Schedule, Measure";
	
	public DataBase(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		ContentValues newRegister;
		
		/* 
		 * 
		 * Start adding diets
		 * 
		 */		
		db.execSQL(sqlCreateDiets);		
		newRegister = new ContentValues();
		newRegister.put("name", "dieta de la luna");
		newRegister.put("weight", 0);
		db.insert("Diet", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "dieta verde");
		newRegister.put("weight", 0);
		db.insert("Diet", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "dieta fuerte");
		newRegister.put("weight", 1);
		db.insert("Diet", null, newRegister);
		
		
		/* 
		 * 
		 * Start adding schedules
		 * 
		 */
		db.execSQL(sqlCreateSchedules);
		newRegister = new ContentValues();
		newRegister.put("schedule_id", 1);
		newRegister.put("name", "desayuno");
		db.insert("Schedule", null, newRegister);

		newRegister = new ContentValues();
		newRegister.put("schedule_id", 2);
		newRegister.put("name", "media mañana");
		db.insert("Schedule", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("schedule_id", 3);
		newRegister.put("name", "almuerzo");
		db.insert("Schedule", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("schedule_id", 4);
		newRegister.put("name", "merienda");
		db.insert("Schedule", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("schedule_id", 5);
		newRegister.put("name", "media tarde");
		db.insert("Schedule", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("schedule_id", 6);
		newRegister.put("name", "cena");
		db.insert("Schedule", null, newRegister);

				
		/* 
		 * 
		 * Start adding measures
		 *
		 */
		db.execSQL(sqlCreateMeasures);
		newRegister = new ContentValues();
		newRegister.put("measure_id", 1);
		newRegister.put("name", "mg");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("measure_id", 2);
		newRegister.put("name", "ml");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("measure_id", 3);
		newRegister.put("name", "porcion");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 4);
		newRegister.put("name", "taza");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 5);
		newRegister.put("name", "rebanada");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 6);
		newRegister.put("name", "loncha");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 7);
		newRegister.put("name", "bol");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 8);
		newRegister.put("name", "plato");
		db.insert("Measure", null, newRegister);
		
		newRegister = new ContentValues();		
		newRegister.put("measure_id", 9);
		newRegister.put("name", "vaso");
		db.insert("Measure", null, newRegister);

		
		/* 
		 * 
		 * Start adding foods
		 *
		 */
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("name", "food_1");
		newRegister.put("calories", 500);
		newRegister.put("amount_main", 300);
		newRegister.put("main_measure", 1);
		newRegister.put("amount_accompaniment", "null");
		newRegister.put("accompaniment_measure", "null");
		newRegister.put("schedule_id", 1);
		db.insert("Food", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "food_2");
		newRegister.put("calories", 345);
		newRegister.put("amount_main", 123);
		newRegister.put("main_measure", 2);
		newRegister.put("amount_accompaniment", 456);
		newRegister.put("accompaniment_measure", 2);
		newRegister.put("schedule_id", 1);
		db.insert("Food", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "food_3");
		newRegister.put("calories", 567);
		newRegister.put("amount_main", 543);
		newRegister.put("main_measure", 3);
		newRegister.put("amount_accompaniment", "null");
		newRegister.put("accompaniment_measure", "null");
		newRegister.put("schedule_id", 2);
		db.insert("Food", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "food_4");
		newRegister.put("calories", 513);
		newRegister.put("amount_main", 715);
		newRegister.put("main_measure", 3);
		newRegister.put("amount_accompaniment", "null");
		newRegister.put("accompaniment_measure", "null");
		newRegister.put("schedule_id", 3);
		db.insert("Food", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "food_5");
		newRegister.put("calories", 917);
		newRegister.put("amount_main", 274);
		newRegister.put("main_measure", 3);
		newRegister.put("amount_accompaniment", 578);
		newRegister.put("accompaniment_measure", 1);
		newRegister.put("schedule_id", 1);
		db.insert("Food", null, newRegister);
		
		newRegister = new ContentValues();
		newRegister.put("name", "food_6");
		newRegister.put("calories", 617);
		newRegister.put("amount_main", 111);
		newRegister.put("main_measure", 2);
		newRegister.put("amount_accompaniment", 661);
		newRegister.put("accompaniment_measure", 3);
		newRegister.put("schedule_id", 4);
		db.insert("Food", null, newRegister);
		
		
		/* 
		 * 
		 * Start adding diet-foods
		 *
		 */
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 1);
		newRegister.put("food_id", 1);
		db.insert("DietFood", null, newRegister);		
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 1);
		newRegister.put("food_id", 2);
		db.insert("DietFood", null, newRegister);
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 1);
		newRegister.put("food_id", 3);
		db.insert("DietFood", null, newRegister);
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 2);
		newRegister.put("food_id", 3);
		db.insert("DietFood", null, newRegister);
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 2);
		newRegister.put("food_id", 4);
		db.insert("DietFood", null, newRegister);
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 3);
		newRegister.put("food_id", 5);
		db.insert("DietFood", null, newRegister);
		
		db.execSQL(sqlCreateFoods);
		newRegister = new ContentValues();
		newRegister.put("diet_id", 3);
		newRegister.put("food_id", 6);
		db.insert("DietFood", null, newRegister);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int olderVersion, int newVersion) {
		db.execSQL(sqlDelete);
		db.execSQL(sqlCreateDiets);
		db.execSQL(sqlCreateSchedules);
		db.execSQL(sqlCreateMeasures);
		db.execSQL(sqlCreateFoods);
		db.execSQL(sqlCreateDietsFoods);
	}
}