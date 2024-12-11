package control;

import java.util.Date;

import database.ThemSachDAO;
import entity.SachGK;
import entity.Sach;
import entity.SachTK;
import ui.ThongBaoThemSachCUI;

public class ThemSachControl {
	
	private ThemSachDAO themSachDAO = null;
	private ThongBaoThemSachCUI thongBaoThemSachCUI = null;
	
	public ThemSachControl() {
		// TODO Auto-generated constructor stub
	}
	
	//setter xuat thong bao
	
	public void setthongBaoThemSachCUI(ThongBaoThemSachCUI thongBaoThemSachCUI) {
		this.thongBaoThemSachCUI = thongBaoThemSachCUI;
	}
	
	public ThemSachControl(ThemSachDAO themSachDAO) {
		this.themSachDAO = themSachDAO;
	}
	//sachGK
	public void themSach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, String tinhTrang) {
		SachGK sgk = new SachGK();
		doThemSach(sgk);
	}
	//sachTK
	public void themSach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, double thue) {
		SachTK stk = new SachTK();
		doThemSach(stk);
	}
	
	// da hinh
	public void doThemSach(Sach sach) {
		themSachDAO.addSach(sach);
		thongBaoThemSachCUI.inThongBao("THEM "+ sach +" THANH CONG !!!");		
	}
}
