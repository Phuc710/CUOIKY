package ui;

import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import control.ThemSachControl;
import entity.SachGK;
import entity.SachTK;

public class ThongTinSachCUI {
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String loaiSachPrompt,maSachPrompt, ngayNhapPrompt, donGiaPrompt, soLuongPrompt, nhaxbPrompt, thuePrompt, tinhTrangPrompt;
	private SimpleDateFormat simpleFormat = null;
	private ThemSachControl themSachControl = null;
	public ThongTinSachCUI() {
		// TODO Auto-generated constructor stub
	}

	public ThongTinSachCUI(PrintWriter _screenOutput, Scanner _keyBoardInput,ThemSachControl _themSachControl ) {
		screenOutput = _screenOutput;
		keyBoardInput = _keyBoardInput;
		themSachControl = _themSachControl;
		loaiSachPrompt = "NHAP LOAI SACH [\"GK\" or \"TK\"]: ";
		maSachPrompt = "NHAP MA SACH: ";
		ngayNhapPrompt = "NHAP NGAY NHAP (dd/MM/yyyy): ";
		donGiaPrompt = "NHAP DON GIA: ";
		soLuongPrompt = "NHAP SO LUONG: ";
		nhaxbPrompt = "NHAP NHA XUAT BAN: ";
		thuePrompt = "NHAP THUE: ";
		tinhTrangPrompt = "NHAP TINH TRANG (moi/cu): ";
		simpleFormat = new SimpleDateFormat("dd/MM/yyyy");
	}

	public void nhapThongTinSach() {
		screenOutput.print(loaiSachPrompt);
        screenOutput.flush();
        String loaiSach = keyBoardInput.nextLine();
        
		screenOutput.print(maSachPrompt);
		screenOutput.flush();
		String maSach = keyBoardInput.nextLine();

		screenOutput.print(ngayNhapPrompt);
		screenOutput.flush();
		String ngayNhapStr = keyBoardInput.nextLine();
		Date ngayNhap = null;
		try {
			ngayNhap = simpleFormat.parse(ngayNhapStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		screenOutput.print(donGiaPrompt);
		screenOutput.flush();
		double donGia = keyBoardInput.nextDouble();

		screenOutput.print(soLuongPrompt);
		screenOutput.flush();
		int soLuong = keyBoardInput.nextInt();
		keyBoardInput.nextLine(); 

		screenOutput.print(nhaxbPrompt);
		screenOutput.flush();
		String nhaXuatBan = keyBoardInput.nextLine();

		if ("GK".equalsIgnoreCase(loaiSach)) {
            screenOutput.print(tinhTrangPrompt);
            screenOutput.flush();
            String tinhTrang = keyBoardInput.nextLine();
            SachGK sachGiaoKhoa = new SachGK(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, tinhTrang);
            // Gọi phương thức thêm sách vào danh sách
            themSachControl.themSach(sachGiaoKhoa);
        } 
		
		else if ("TK".equalsIgnoreCase(loaiSach)) {
            screenOutput.print(thuePrompt);
            screenOutput.flush();
            double thue = keyBoardInput.nextDouble();
            keyBoardInput.nextLine(); // Đọc dòng còn lại
            SachTK sachThamKhao = new SachTK(maSach, ngayNhap, donGia, soLuong, nhaXuatBan, thue);
            // Gọi phương thức thêm sách vào danh sách
            themSachControl.themSach(sachThamKhao);
        } 
		
		else {
            screenOutput.println("Loai sach khong hop le! Vui long nhap 'GK' hoac 'TK'.");
        }
		
	}
}
