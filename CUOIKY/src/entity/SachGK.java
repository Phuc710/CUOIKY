package entity;

import java.util.Date;

public class SachGK extends Sach {
	private String tinhTrang;

	public SachGK() {
		// TODO Auto-generated constructor stub
	}

	public SachGK(String maSach, Date ngayNhap, double donGia, int soLuong, String nhaxb, String tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaxb);
		this.tinhTrang = tinhTrang;
	}

	@Override
	public double tinhTien() {
		if (tinhTrang.equalsIgnoreCase("mới")) {
			return soLuong * donGia;
		} else {
			return soLuong * donGia * 0.5;
		}
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa{" + super.toString() + ", tinhTrang='" + tinhTrang + '\'' + '}';
	}

}
