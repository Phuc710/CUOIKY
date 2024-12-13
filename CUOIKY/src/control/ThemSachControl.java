package control;

import java.util.Date;

import database.ThemSachDAO;
import database.ThemSachDAOFile;
import entity.SachGK;
import entity.Sach;
import entity.SachTK;
import ui.ThongBaoThemSachCUI;

public class ThemSachControl {
	
	private ThemSachDAO themSachDAO = null;
	private ThongBaoThemSachCUI thongBaoThemSachCUI = null;
	private ThemSachDAOFile themsachdaofile = null;
	public ThemSachControl() {
		// TODO Auto-generated constructor stub
	}
	
	//setter xuat thong bao
	public void setthemsachDAOFILE(ThemSachDAOFile themsachdaofile) {
		this.themsachdaofile = themsachdaofile;
	}
	public void setthongBaoThemSachCUI(ThongBaoThemSachCUI thongBaoThemSachCUI) {
		this.thongBaoThemSachCUI = thongBaoThemSachCUI;
	}
	
	public ThemSachControl(ThemSachDAO themSachDAO) {
		this.themSachDAO = themSachDAO;
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
		themSachDAO.addSach(sach);
		themsachdaofile.addSach(sach);
		thongBaoThemSachCUI.inThongBao("THEM SACH THANH CONG !!!");		
	}
}
