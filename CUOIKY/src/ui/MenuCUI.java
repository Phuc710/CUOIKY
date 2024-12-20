package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import control.InListSachControl;
import control.XoaSachControl;
public class MenuCUI {
	// fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String prompt;
	private String command;
	private ThongTinSachCUI thongTinSachCUI = null;	
	private InListSachControl inlistsachcontrol = null;
	private XoaSachControl xoasachcontrol =null;
	// constructor
	public MenuCUI() {
		// TODO Auto-generated constructor stub
		screenOutput = new PrintWriter(System.out);
	}
	
	public void setinlistsachcontrol(InListSachControl inlistsachcontrol) {
		this.inlistsachcontrol = inlistsachcontrol;
	}
	public void setXoaSachCotrol(XoaSachControl xoasachcontrol) {
        this.xoasachcontrol = xoasachcontrol;
    }
	public void MenuCUI(PrintWriter screenOutput, Scanner keyBoardInput,ThongTinSachCUI thongTinSachCUI) {
		this.screenOutput = screenOutput;
		this.keyBoardInput = keyBoardInput;
		this.thongTinSachCUI = thongTinSachCUI;
		prompt = "->";
		command = "";// = rong~
	}

	// functions
	public void controlLoop() {
		screenOutput.println("go lenh \"help\" de duoc ho tro!");
		screenOutput.flush();
		while (true) {
			screenOutput.print(prompt);
			screenOutput.flush();
			command = keyBoardInput.nextLine().trim().toUpperCase();
			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			if ("them".equalsIgnoreCase(command)) {
				themSach();
				continue;
			}
			if ("xoa".equalsIgnoreCase(command)) {
				xoaSach();
		        continue;
		    }
			if ("in".equalsIgnoreCase(command)) {
				inlistsach();
				continue;
			}
			if ("exit".equalsIgnoreCase(command)) {
				screenOutput.print("KET THUC");screenOutput.flush();
				break;
			}
			else {
				screenOutput.println("Lenh khong hop le. Vui long nhap lai.");
				screenOutput.println("go lenh \"help\" de duoc ho tro!");
				screenOutput.flush();
			}

		}
	}
	private void themSach() {
		thongTinSachCUI.nhapThongTinSach();
	}
	private void inlistsach() {
		inlistsachcontrol.getlistsach();
	}
	public void xoaSach() {
        screenOutput.print("NHAP MA SACH CAN XOA: ");
        screenOutput.flush();
        String maSach = keyBoardInput.nextLine();
        xoasachcontrol.xoaSach(maSach); 
    }

	public void help() {
	    screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
	    screenOutput.println("[HELP] - Ho tro su dung phan mem");
	    screenOutput.println("[THEM] - Them moi sach");
	    screenOutput.println("[IN] - In danh sach sach");
	    screenOutput.println("[XOA] - Xoa sach");
	    screenOutput.println("[EXIT] - Thoat chuong trinh");
	    screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
	}
}
