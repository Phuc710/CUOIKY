package App;

import java.io.PrintWriter;
import java.util.Scanner;
import control.InListSachControl;
import control.ThemSachControl;
import database.ArrayListMockDatabase;
import database.InListSachDAO;
import database.InListSachDAOFile;
import database.ThemSachDAO;
import database.ThemSachDAOFile;
import ui.InListSachCUI;
import ui.MenuCUI;
import ui.ThongTinSachCUI;
import ui.ThongBaoThemSachCUI;

public class AppThuVien {
    public static void main(String[] args) {
    	ArrayListMockDatabase.initDatabase();
    	
    	// giao dien IO
    	PrintWriter pWriterRemote = new PrintWriter(System.out, true);
        Scanner scannerRemote = new Scanner(System.in);
        
        //DAO 
        ThemSachDAO themSachDAO = new ThemSachDAO();
        ThemSachDAOFile themsachdaofile = new ThemSachDAOFile("Sach.db");
        InListSachDAOFile inlistsachdaofile = new InListSachDAOFile("Sach.db");
        InListSachDAO inlistsachdao = new InListSachDAO();
        ThongBaoThemSachCUI thongBaoThemSachCUI = new ThongBaoThemSachCUI(pWriterRemote);
        InListSachCUI inlistSachCUI = new InListSachCUI(pWriterRemote);
        
        //control 
        ThemSachControl themSachControl = new ThemSachControl(themSachDAO);
        themSachControl.setthemsachDAOFILE(themsachdaofile);
        themSachControl.setthongBaoThemSachCUI(thongBaoThemSachCUI);
        InListSachControl inListSachControl = new InListSachControl(inlistsachdao,inlistSachCUI);
        inListSachControl.setInListSachDAO(inlistsachdaofile);
        
        
        //cui
        ThongTinSachCUI thongTinSachCUI = new ThongTinSachCUI(pWriterRemote, scannerRemote, themSachControl);
        MenuCUI menuCUI = new MenuCUI();
        menuCUI.setinlistsachcontrol(inListSachControl);
        menuCUI.MenuCUI(pWriterRemote, scannerRemote, thongTinSachCUI);
        menuCUI.controlLoop();
    }
}
