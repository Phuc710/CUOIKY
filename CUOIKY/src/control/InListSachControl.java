package control;
import java.util.ArrayList;
import database.InListSachDAO;
import database.InListSachDAOFile;
import ui.InListSachCUI;
import entity.Sach;

public class InListSachControl {
	private InListSachCUI inlistsachcui= null;
	private InDAO inDAO = null;
	//private InListSachDAO inlistsachdao = null;
	//private InListSachDAOFile inlistsachdaofile = null;
	public InListSachControl() {
		// TODO Auto-generated constructor stub
	}
	public InListSachControl(InListSachCUI inlistsachcui,InDAO inDAO ) {
		this.inlistsachcui = inlistsachcui;
		this.inDAO = inDAO;
	}
	
	public void setInListSachDAO(InDAO inDAO) {
		this.inDAO = inDAO;
	}
	
	public void getlistsach() {
		ArrayList<Sach> listsach = inDAO.getAllSach();
		inlistsachcui.inlistsach(listsach);
	}
}
