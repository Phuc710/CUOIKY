package database;

import java.util.ArrayList;
import java.util.Date;

import entity.Sach;
import entity.SachTK;
import entity.SachGK;

public class ArrayListMockDatabase {
	// da hinh
	public static ArrayList<Sach> database = null;
	
	public static void initDatabase() {
		// khoi tao du lieu nguyen thuy		
		database = new ArrayList<Sach>();	
		database.add(new SachGK("SGK01", new Date(), 10000, 10, "ABC", "Moi"));
        database.add(new SachTK("STK01", new Date(), 20000, 5, "XYZ", 10));
	}
	public static void insertSach(Sach sach) {
		database.add(sach);
	}
	public static ArrayList<Sach> getAllSach(){
		return database;
	}
}

