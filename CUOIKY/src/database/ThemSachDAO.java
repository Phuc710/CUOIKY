package database;
import control.ThemDAO;
import entity.Sach;

public class ThemSachDAO extends ThemDAO {
	public ThemSachDAO() {
		// TODO Auto-generated constructor stub
	}
	public void addSach(Sach sach) {
		ArrayListMockDatabase.insertSach(sach);
	}
	
}
