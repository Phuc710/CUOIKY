package ui;

import java.io.PrintWriter;
import java.util.Scanner;

public class MenuCUI {
	// fields
	private PrintWriter screenOutput = null;
	private Scanner keyBoardInput = null;
	private String prompt;
	private String command;

	// constructor
	public MenuCUI() {
		// TODO Auto-generated constructor stub
	}

	public void MenuCUI(PrintWriter screenOutput, Scanner keyBoardInput) {
		this.screenOutput = screenOutput;
		this.keyBoardInput = keyBoardInput;
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
			if ("exit".equalsIgnoreCase(command)) {
				screenOutput.print("KET THUC");
				break;
			}

		}
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
