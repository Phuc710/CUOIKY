package ui;
import java.io.PrintWriter;
import java.util.ArrayList;
import entity.Sach;

public class InListSachCUI {
	private PrintWriter screenOutput = null;
	
	public InListSachCUI(PrintWriter screenOutput) {
		this.screenOutput = screenOutput;
	}
	public void inlistsach(ArrayList<Sach> listsach) {
		if (listsach == null || listsach.isEmpty()) {
	        screenOutput.println("LIST RONG !!!");
	    } else {
		for(Sach sach : listsach) {
			screenOutput.println(sach.toString());
		}
	}
}
}
