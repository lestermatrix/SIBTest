package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Student;

public class StudentController {

	private Connection connection; 
	
	public StudentController(Connection connection) {
		this.connection = connection;
	}
	
	 public boolean insertStudent(Student student) {
		 
		 String insertQuery = "INSERT INTO STUDENT_TEST (ID, NAME, AGE, ACTIVE) VALUES (? , ? ,? ,?)";
		 try (PreparedStatement insertSt = connection.prepareStatement(insertQuery)){
			 
			 insertSt.setInt(1, student.getID());
			 insertSt.setString(2, student.getName());
			 insertSt.setInt(3, 29);
			 insertSt.setInt(4, 1);
			 
			 insertSt.executeUpdate();
			 connection.commit();
			 
			 return true;
		 }catch(Exception e) {
		  System.out.println("insert student failed");
		  e.printStackTrace();
		 }
		 
		 return false;
	 }
	
}
