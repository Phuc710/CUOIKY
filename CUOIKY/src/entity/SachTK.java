package entity;

import java.util.Date;

public class SachTK extends Sach {
	private double thue;

	public SachTK() {
		// TODO Auto-generated constructor stub
	}

	public SachTK(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaxb);
		this.thue = thue;
	}

	@Override
	public double tinhTien() {
		return soLuong * donGia + thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao[" + super.toString() + ", thue = " + thue + "]";
	}

}
