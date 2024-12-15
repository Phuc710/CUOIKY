package control;
import java.util.ArrayList;
import database.InListSachDAO;
import database.InListSachDAOFile;
import ui.InListSachCUI;
import entity.Sach;

public class InListSachControl {
	private InListSachCUI inlistsachcui= null;
	private InListSachDAO inlistsachdao = null;
	private InListSachDAOFile inlistsachdaofile = null;
	public InListSachControl() {
		// TODO Auto-generated constructor stub
	}
	public InListSachControl(InListSachCUI inlistsachcui,InListSachDAO inlistsachdao ) {
		this.inlistsachcui = inlistsachcui;
		this.inlistsachdao = inlistsachdao;
	}
	
	public void setInListSachDAO(InListSachDAOFile inlistsachdaofile) {
		this.inlistsachdaofile = inlistsachdaofile;
	}
	
	public void getlistsach() {
		ArrayList<Sach> listsach = inlistsachdaofile.GetallSach();
		inlistsachcui.inlistsach(listsach);
	}
}
