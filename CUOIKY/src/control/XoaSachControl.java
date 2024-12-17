package control;

import ui.ThongBaoThemSachCUI;

public class XoaSachControl {

    private ThongBaoThemSachCUI thongbaoThemSachCUI = null;
    private XoaDAO xoaDAO = null;

    public XoaSachControl() {
        // TODO Auto-generated constructor stub
    }

    public XoaSachControl(XoaDAO xoaDAO) {
        this.xoaDAO = xoaDAO;
    }

    public void setthongBaoThemSachCUI(ThongBaoThemSachCUI thongBaoThemSachCUI) {
        this.thongbaoThemSachCUI = thongBaoThemSachCUI;
    }

    public void xoaSach(String maSach) {
        if (xoaDAO != null) {
            xoaDAO.removeSach(maSach);
            thongbaoThemSachCUI.inThongBao("XOA SACH THANH CONG !!!");
        } else {
            thongbaoThemSachCUI.inThongBao("XOA SACH THAT BAI !!!");
        }
    }
}