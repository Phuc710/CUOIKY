package database;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import entity.Sach;

public class InListSachDAOFile {
private File fileData = null;
	
	public InListSachDAOFile(String fileName) {
		this.fileData = new File(fileName);
	}
	
	public ArrayList<Sach> GetallSach() {
		FileInputStream fileStream = null;
		ObjectInputStream oIS = null;
		ArrayList<Sach> listSach = null;
		
		try {
			fileStream = new FileInputStream(fileData);
			oIS = new ObjectInputStream(fileStream);
			listSach = (ArrayList<Sach>) oIS.readObject();
			oIS.close();
			fileStream.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (EOFException eofException) {
			eofException.printStackTrace();
			
		}
		catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return listSach;
	}
}
