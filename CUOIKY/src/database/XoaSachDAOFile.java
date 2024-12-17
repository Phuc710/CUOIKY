package database;

import java.io.*;
import java.util.ArrayList;
import control.XoaDAO;
import entity.Sach;

public class XoaSachDAOFile extends XoaDAO {
    private File fileData = null;

    public XoaSachDAOFile(String fileName) {
        this.fileData = new File(fileName);
    }

    public void removeSach(String maSach) {
        FileInputStream fileStream = null;
        ObjectInputStream oIS = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream oOS = null;
        ArrayList<Sach> listSach = new ArrayList<>();

        if (!fileData.exists() || fileData.length() == 0) {
            return;
        }

        try {
            fileStream = new FileInputStream(fileData);
            oIS = new ObjectInputStream(fileStream);
            listSach = (ArrayList<Sach>) oIS.readObject();
            oIS.close();
            fileStream.close();

            for (Sach sach : listSach) {
                if (sach.getMaSach().equals(maSach)) {
                    listSach.remove(sach);
                    break;
                }
            }

            fileOutputStream = new FileOutputStream(fileData);
            oOS = new ObjectOutputStream(fileOutputStream);
            oOS.writeObject(listSach);
            oOS.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}