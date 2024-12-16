package database;

import java.util.ArrayList;
import control.InDAO;
import entity.Sach;

public class InListSachDAO implements InDAO {
	
	public InListSachDAO() {
	}
	public ArrayList<Sach> getAllSach(){
		return ArrayListMockDatabase.getAllSach();
	}	
}
