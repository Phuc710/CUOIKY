package App;

import java.io.PrintWriter;
import java.util.Scanner;
import control.InListSachControl;
import control.ThemSachControl;
import database.ArrayListMockDatabase;
import database.InListSachDAO;
import database.ThemSachDAO;
import ui.InListSachCUI;
import ui.MenuCUI;
import ui.ThongTinSachCUI;
import ui.ThongBaoThemSachCUI;

public class AppThuVien {
    public static void main(String[] args) {
    	ArrayListMockDatabase.initDatabase();
    	
    	//sử dụng Class MenuCUI
    	PrintWriter pWriterRemote = new PrintWriter(System.out, true);
        Scanner scannerRemote = new Scanner(System.in);

        InListSachCUI inlistSachCUI = new InListSachCUI(pWriterRemote);
        
        InListSachDAO inListSachDAO = new InListSachDAO();
        InListSachControl inListSachControl = new InListSachControl(inlistSachCUI, inListSachDAO);

        ThemSachDAO themSachDAO = new ThemSachDAO();
        ThongBaoThemSachCUI thongBaoThemSachCUI = new ThongBaoThemSachCUI(pWriterRemote);
        
        ThemSachControl themSachControl = new ThemSachControl(themSachDAO);
        themSachControl.setthongBaoThemSachCUI(thongBaoThemSachCUI);

        ThongTinSachCUI thongTinSachCUI = new ThongTinSachCUI(pWriterRemote, scannerRemote, themSachControl);

        
        MenuCUI menuCUI = new MenuCUI();
        menuCUI.setinlistsachcontrol(inListSachControl);

        menuCUI.MenuCUI(pWriterRemote, scannerRemote, thongTinSachCUI);
        menuCUI.controlLoop();
    }
}
