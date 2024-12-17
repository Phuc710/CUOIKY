package database;

import control.XoaDAO;
import entity.Sach;

public class XoaSachDAO extends XoaDAO {
    public XoaSachDAO() {
        // TODO Auto-generated constructor stub
    }

    public void removeSach(String maSach) {
        ArrayListMockDatabase.removeSach(maSach);
    }
}