package control;
import java.util.ArrayList;
import database.InListSachDAO;
import ui.InListSachCUI;
import entity.Sach;

public class InListSachControl {
	private InListSachCUI inlistsachcui= null;
	private InListSachDAO inlistsachdao = null;
	public InListSachControl() {
		// TODO Auto-generated constructor stub
	}
	public InListSachControl(InListSachCUI inlistsachcui,InListSachDAO inlistsachdao ) {
		this.inlistsachcui = inlistsachcui;
		this.inlistsachdao = inlistsachdao;
	}
	
	public void getlistsach() {
		ArrayList<Sach> listsach = inlistsachdao.GetallSach();
		inlistsachcui.inlistsach(listsach);
	}
}
