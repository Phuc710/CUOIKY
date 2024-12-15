package database;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import entity.Sach;

public class ThemSachDAOFile {
	
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
	        // Kiểm tra file có tồn tại trước khi đọc
	        if (!fileData.exists() || fileData.length() == 0) {
	            tempData = new ArrayList<>();
	            return; // Nếu file không tồn tại hoặc rỗng, kết thúc tại đây
	        }

	        fileStream = new FileInputStream(fileData);
	        oIS = new ObjectInputStream(fileStream);

	        // Đọc dữ liệu từ file
	        tempData = (List<Sach>) oIS.readObject();

	    } catch (EOFException e) {
	        // File rỗng, khởi tạo danh sách mới
	        tempData = new ArrayList<>();
	    } catch (IOException | ClassNotFoundException e) {
	        e.printStackTrace();
	        tempData = new ArrayList<>(); // Đảm bảo danh sách không bị null
	    } finally {
	        try {
	            if (oIS != null) oIS.close();
	            if (fileStream != null) fileStream.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


	
}
