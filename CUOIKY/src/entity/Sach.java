package entity;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sach implements Serializable{
	// field
	
	private static final long serialVersionUID = 2593189524794325047L;
	protected String maSach;
	protected Date ngayNhap;
	protected double donGia;
	protected int soLuong;
	protected String nhaxb;
	

	// constructor
	public Sach() {
		// TODO Auto-generated constructor stub
	}

	public Sach(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb) {
		this.maSach = maSach;
		this.ngayNhap = ngayNhap;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaxb = nhaxb;
	}
	//da hinh
	public abstract double tinhTien();

	public String getMaSach() {
		return maSach;
	}

	public String getNhaXuatBan() {
		return nhaxb;
	}

	public double getDonGia() {
		return donGia;
	}
	public String getNgayNhap() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(ngayNhap);
    }
	@Override
	public String toString() {
	    return "maSach = " + maSach +", ngayNhap = " + getNgayNhap() +", donGia = " + donGia + " VND"+", soLuong = " + soLuong +", nhaXuatBan = " + nhaxb;          
	           
	}

}
