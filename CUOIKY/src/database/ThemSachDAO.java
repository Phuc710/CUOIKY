package database;
import entity.Sach;

public class ThemSachDAO {
	public ThemSachDAO() {
		// TODO Auto-generated constructor stub
	}
	public void addSach(Sach sach) {
		ArrayListMockDatabase.insertSach(sach);
	}
}
