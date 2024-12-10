package entity;

import java.util.Date;

public abstract class Sach {
	// field
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

	@Override
	public String toString() {
		return "Sach{" + "maSach='" + maSach + '\'' + ", ngayNhap=" + ngayNhap + ", donGia=" + donGia + ", soLuong="
				+ soLuong + ", nhaXuatBan='" + nhaxb + '\'' + '}';
	}

}
