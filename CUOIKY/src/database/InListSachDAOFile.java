package database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import control.InDAO;
import entity.Sach;

public class InListSachDAOFile implements InDAO {
private File fileData = null;
	
	public InListSachDAOFile(String fileName) {
		this.fileData = new File(fileName);
	}
	
	public ArrayList<Sach> getAllSach() {
		FileInputStream fileStream = null;
		ObjectInputStream oIS = null;		
		ArrayList<Sach> listSach = new ArrayList<>();
		
		if (!fileData.exists() || fileData.length() == 0) { // check tep co ton tai k
	        return listSach;
	    }
		
		try {			
			fileStream = new FileInputStream(fileData);
			oIS = new ObjectInputStream(fileStream);
			listSach = (ArrayList<Sach>) oIS.readObject();
			oIS.close();
			fileStream.close();
			
		} catch (FileNotFoundException e) { // file k ton tai
			
			e.printStackTrace();
		} catch (EOFException eofException) {
			eofException.printStackTrace();
			
		}
		catch (IOException e) { // loi doc du lieu
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return listSach;
	}
}
