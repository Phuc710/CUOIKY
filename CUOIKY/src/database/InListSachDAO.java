package database;
import java.util.ArrayList;

import entity.Sach;
public class InListSachDAO {
	public InListSachDAO() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Sach> GetallSach(){
		if (ArrayListMockDatabase.database == null) {
	        ArrayListMockDatabase.initDatabase();
	    }
		return ArrayListMockDatabase.GetallSach();
	}
}
