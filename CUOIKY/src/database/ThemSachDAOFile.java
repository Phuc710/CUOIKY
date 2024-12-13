package database;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import entity.Sach;

public class ThemSachDAOFile {
	private File file;
	public ThemSachDAOFile(String fileName) {
		file = new File(fileName);
	}
	public void addSach(Sach sach) {
		FileOutputStream fOS = null;		
		ObjectOutputStream oOS = null;
		try {
			fOS  = new FileOutputStream(file);
			oOS = new ObjectOutputStream(fOS);
			oOS.writeObject(sach);
			oOS.close();
			fOS.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	
	}
	
}
