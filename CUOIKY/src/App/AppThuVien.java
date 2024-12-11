package App;
import java.io.PrintWriter;
import java.util.Scanner;
import ui.MenuCUI;

public class AppThuVien {
	public static void main(String[] args) {
		
		PrintWriter pWriterRemote = new PrintWriter(System.out, true);
		Scanner scannerRemote = new Scanner(System.in);
		
		MenuCUI menucui = new MenuCUI(pWriterRemote,scannerRemote);
		menucui.controlLoop();
		
	}
}
