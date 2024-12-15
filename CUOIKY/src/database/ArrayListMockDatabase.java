package database;

import java.util.ArrayList;

import entity.Sach;
import entity.SachTK;
import entity.SachGK;

public class ArrayListMockDatabase {
	// da hinh
	public static ArrayList<Sach> database = null;
	
	public static void initDatabase() {
		database = new ArrayList<Sach>();
		
	}
	public static void insertSach(Sach sach) {
		database.add(sach);
	}
	public static ArrayList<Sach> GetallSach(){
		return database;
	}
}

