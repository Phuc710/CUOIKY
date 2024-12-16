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
		Date ngayNhapGK = new Date(2000, 1, 29); 
        Date ngayNhapTK = new Date(2003, 1, 20);
		database = new ArrayList<Sach>();
		insertSach(new SachGK("GK10", ngayNhapGK, 10000, 2, "Phucc", "moi"));
		insertSach(new SachTK("TK10", ngayNhapTK, 15000, 1, "HAHA",10));
		
	}
	public static void insertSach(Sach sach) {
		database.add(sach);
	}
	public static ArrayList<Sach> getAllSach(){
		return database;
	}
}

