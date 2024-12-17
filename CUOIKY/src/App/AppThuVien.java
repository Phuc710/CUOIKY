package App;

import java.io.PrintWriter;
import java.util.Scanner;
import control.InListSachControl;
import control.ThemSachControl;
import control.XoaSachControl;
import database.ArrayListMockDatabase;
import database.InListSachDAO;
import database.InListSachDAOFile;
import database.ThemSachDAO;
import database.ThemSachDAOFile;
import database.XoaSachDAO;
import database.XoaSachDAOFile;
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

        // DAO
        ThemSachDAO themSachDAO = new ThemSachDAO();
        XoaSachDAO xoaSachDAO = new XoaSachDAO();
        XoaSachDAOFile xoaSachDAOFile = new XoaSachDAOFile("Sach.db");

        ThemSachDAOFile themsachdaofile = new ThemSachDAOFile("Sach.db");

        InListSachDAOFile inlistsachdaofile = new InListSachDAOFile("Sach.db");
        InListSachDAO inlistsachdao = new InListSachDAO();
        ThongBaoThemSachCUI thongBaoThemSachCUI = new ThongBaoThemSachCUI(pWriterRemote);
        InListSachCUI inlistSachCUI = new InListSachCUI(pWriterRemote);

        // xoa sach
        XoaSachControl xoasachcontrol = new XoaSachControl(xoaSachDAO);
        XoaSachControl xoasachcontrolfile = new XoaSachControl(xoaSachDAOFile);
        xoasachcontrol.setthongBaoThemSachCUI(thongBaoThemSachCUI);
        xoasachcontrolfile.setthongBaoThemSachCUI(thongBaoThemSachCUI);

        // control
        ThemSachControl themSachControl = new ThemSachControl(themSachDAO);
        themSachControl.setthemsachDAOFILE(themsachdaofile);
        themSachControl.setthongBaoThemSachCUI(thongBaoThemSachCUI);

        InListSachControl inListSachControl = new InListSachControl(inlistsachdao, inlistSachCUI);
        inListSachControl.setInListSachDAO(inlistsachdaofile);

        // cui
        ThongTinSachCUI thongTinSachCUI = new ThongTinSachCUI(pWriterRemote, scannerRemote, themSachControl);
        MenuCUI menuCUI = new MenuCUI();
        menuCUI.setinlistsachcontrol(inListSachControl);
        menuCUI.setXoaSachCotrol(xoasachcontrol);

        menuCUI.MenuCUI(pWriterRemote, scannerRemote, thongTinSachCUI);
        menuCUI.controlLoop();
    }
}