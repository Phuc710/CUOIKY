package ui;

import java.io.PrintWriter;
import java.util.Scanner;

import control.InListSachControl;

public class MenuCUI {
	// fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String prompt;
	private String command;
	private ThongTinSachCUI thongTinSachCUI = null;	
	private InListSachControl inlistsachcontrol = null;
	// constructor
	public MenuCUI() {
		// TODO Auto-generated constructor stub
	}
	
	public void setinlistsachcontrol(InListSachControl inlistsachcontrol) {
		this.inlistsachcontrol = inlistsachcontrol;
	}
	public void MenuCUI(PrintWriter screenOutput, Scanner keyBoardInput,ThongTinSachCUI thongTinSachCUI) {
		this.screenOutput = screenOutput;
		this.keyBoardInput = keyBoardInput;
		this.thongTinSachCUI = thongTinSachCUI;
		prompt = "->";
		command = " ";// = rong~
	}

	// functions
	public void controlLoop() {
		screenOutput.println("go lenh \"help\" de duoc ho tro!");
		screenOutput.flush();
		while (true) {
			screenOutput.print(prompt);
			screenOutput.flush();
			command = keyBoardInput.nextLine().trim();
			if ("help".equalsIgnoreCase(command)) {
				help();
				continue;
			}
			if ("them".equalsIgnoreCase(command)) {
				themSach();
				continue;
			}
			if ("in".equalsIgnoreCase(command)) {
				inlistsach();
				continue;
			}
			if ("exit".equalsIgnoreCase(command)) {
				screenOutput.print("KET THUC");
				break;
			}

		}
	}
	private void themSach() {
		thongTinSachCUI.nhapThongTinSach();
	}
	private void inlistsach() {
		inlistsachcontrol.getlistsach();
	}

	private void help() {
		screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
		screenOutput.println("[HELP] - Ho tro su dung phan mem");
		screenOutput.println("[THEM] - Them moi sinh vien");
		screenOutput.println("[IN] - In danh sach sinh vien");
		screenOutput.println("[EXIT] - In danh sach sinh vien");
		screenOutput.println("~~~~~~~~~~Console Help Menu~~~~~~~~~");
	}
}
