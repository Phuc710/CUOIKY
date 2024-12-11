package ui;

import java.io.PrintWriter;

public class ThongBaoThemSachCUI {
	private PrintWriter screenOutput = null;
	
	public ThongBaoThemSachCUI() {
		// TODO Auto-generated constructor stub
	}

	public ThongBaoThemSachCUI(PrintWriter screenOutput) {
		this.screenOutput = screenOutput;
	}
	
	public void inThongBao(String noiDung) {
		screenOutput.println(noiDung);
	}
		
}
