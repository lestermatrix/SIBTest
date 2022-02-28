package view;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import model.Student;
import utils.DBUtils;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import controller.StudentController;

import javax.swing.*;
public class StudentForm extends JFrame {

	
	private JPanel contentPane;
	private JTextField studentIDValue; 
	private JTextField studentNameValue; 
	
	public StudentForm() {
		
		this.setVisible(true);
		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 500, 500);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        contentPane.setLayout(new BorderLayout(0, 0));
	        setContentPane(contentPane);

	        JPanel panel = new JPanel();
	        contentPane.add(panel, BorderLayout.CENTER);
	        panel.setLayout(null);

	        JLabel lblUserName = new JLabel("STUDENT ID");
	        lblUserName.setBounds(150, 100, 100, 14);
	        panel.add(lblUserName);

	        JLabel lblPassword = new JLabel("STUDENT NAME");
	        lblPassword.setBounds(150, 200, 100, 14);
	        panel.add(lblPassword);
	        
	        studentIDValue = new JTextField();
	        studentIDValue.setBounds(260, 100, 100, 20);
	        panel.add(studentIDValue);
	        
	        studentNameValue = new JTextField();
	        studentNameValue.setBounds(260, 200, 100, 20);
	        panel.add(studentNameValue);
	        
	        
	        JButton saveButton = new JButton();
	        saveButton.setBounds(260, 300, 150,20);
	        saveButton.setText("Save Student");
	        panel.add(saveButton);
	        
	        saveButton.addActionListener(new ActionListener() {
	        	
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				
					
					
				System.out.print("save studend start");
				System.out.println("text: " +studentIDValue.getText());
				Student student = new Student(Integer.valueOf(studentIDValue.getText()), studentNameValue.getText());
				try {
					StudentController  stController = new StudentController(DBUtils.getDBConnection());
					System.out.println("ID: " +student.getID());
					System.out.println("NAME: " +student.getName());
					stController.insertStudent(student);
					
					JOptionPane.showMessageDialog(panel, "Student successfully added");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				}
	        });
	        
		
	}
	
	
}
