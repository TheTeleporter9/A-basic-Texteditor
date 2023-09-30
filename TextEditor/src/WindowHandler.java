
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowHandler implements ActionListener{
	
	public String fileName;
	public String fileContent;

	FileManeger fileM = new FileManeger();
	
	JFrame frame = new JFrame();
	JButton createButton = new JButton("Create File");
	JButton nameButton = new JButton("Name File");
	JTextArea tx = new JTextArea();
	
	WindowHandler(){
		
		
		Font mainFont = new Font("Zilla Slab Regular", Font.PLAIN, 30);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(950, 630);
		frame.setLayout(null);
		
		createButton.setBounds(600, 25, 140, 40);
		createButton.addActionListener(this);
		frame.add(createButton);
		
		nameButton.setBounds(600, 65, 140, 40);
		
		tx.setBounds(50, 5, 500, 530);
		nameButton.addActionListener(this);
		//frame.add(nameButton);
		
		tx.setFont(mainFont);
		
		
		
		frame.add(tx);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == createButton) {
			if(fileName != null && fileContent != null) {
				return;
			}
			fileContent = tx.getText();
			fileM.createFile(fileName, fileContent);
			System.out.println("Create file");
		}
		if(e.getSource() == nameButton) {
			fileName = JOptionPane.showInputDialog(frame, "Insert Filename", null);
			
			System.out.println(fileName);
		}
		
	}
}
