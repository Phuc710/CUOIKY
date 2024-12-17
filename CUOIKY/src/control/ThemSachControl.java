package control;

import java.util.Date;

import database.ThemSachDAO;
import database.ThemSachDAOFile;
import entity.SachGK;
import entity.Sach;
import entity.SachTK;
import ui.ThongBaoThemSachCUI;

public class ThemSachControl {
	
	//private ThemSachDAO themSachDAO = null;
	//private ThemSachDAOFile themsachdaofile = null;
	private ThongBaoThemSachCUI thongBaoThemSachCUI = null;
	private ThemDAO themDAO = null;
	public ThemSachControl() {
		// TODO Auto-generated constructor stub
	}
	
	//setter xuat thong bao
	
	public void setthongBaoThemSachCUI(ThongBaoThemSachCUI thongBaoThemSachCUI) {
		this.thongBaoThemSachCUI = thongBaoThemSachCUI;
	}
	
	public ThemSachControl(ThemDAO themDAO) {
		this.themDAO = themDAO;
	}
	public void setthemsachDAOFILE(ThemDAO themDAO) {
		this.themDAO = themDAO;
	}
	//sachGK
	public void themSach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, String tinhTrang) {
		SachGK sgk = new SachGK(maSach, ngayNhap, donGia, soLuong, nhaxb, tinhTrang);
		doThemSach(sgk);
	}
	//sachTK
	public void themSach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, double thue) {
		SachTK stk = new SachTK(maSach, ngayNhap, donGia, soLuong, nhaxb, thue);
		doThemSach(stk);
	}
	
	// da hinh
	public void doThemSach(Sach sach) {
		
			//themSachDAO.addSach(sach);
	        themDAO.addSach(sach);
	        thongBaoThemSachCUI.inThongBao("THEM SACH THANH CONG !!!");
	    
	}
}