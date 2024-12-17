package database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import control.ThemDAO;
import entity.Sach;

public class ThemSachDAOFile extends ThemDAO {
	
	private File fileData = null;
	private List<Sach> tempData = null;
	
	public ThemSachDAOFile(String fileName) {
		fileData = new File(fileName);
		
	}
	public void addSach(Sach sach) {
		
		FileOutputStream fileStream = null;
		ObjectOutputStream os = null;
		
		try {
			
			readDataToListFromFile();
			//mở kênh đến file cần ghi đối tượng
			fileStream = new FileOutputStream(fileData);
			//dùng công cụ để ghi xuống file thông qua kênh fileStream
			os = new ObjectOutputStream(fileStream);
			this.tempData.add(sach);
			os.writeObject(tempData);
			os.close();
			fileStream.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	private void readDataToListFromFile() {
		FileInputStream fileStream = null;
		ObjectInputStream oIS = null;
		
		try {
			fileStream = new FileInputStream(fileData);
			oIS = new ObjectInputStream(fileStream);
			
			this.tempData = (List<Sach>) oIS.readObject();
			
			oIS.close();
			fileStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException eofException) {
			eofException.printStackTrace();
			if(tempData == null) {
				tempData = new ArrayList<Sach>();
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
