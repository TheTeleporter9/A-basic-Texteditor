import java.io.*;

import javax.swing.JFileChooser;


public class FileManeger {
	private String main_filePath;
	public void SelectFile() {
		JFileChooser fileChooser = new JFileChooser();
		
		int response = fileChooser.showSaveDialog(null);
		
		if(response == JFileChooser.APPROVE_OPTION) {
			main_filePath = fileChooser.getSelectedFile().getAbsolutePath();
		}
		
	}
	
	public void createFile(String fileName, String fileContent) {
		SelectFile();
		File file = new File(main_filePath + fileName + ".txt");
		try {
			if(!file.exists()) {
					file.createNewFile();
			}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println(fileContent);
			pw.close();
			System.out.println("File Generated");
			
		} catch (IOException e) {
			
			
			
			e.printStackTrace();
		}
	}
	
}
