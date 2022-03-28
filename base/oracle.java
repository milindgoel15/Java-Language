/*

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;



public class ConnectionClass {

public Connection getConnection() throws ClassNotFoundException, SQLException {

	Class.forName("oracle.jdbc.driver.OracleDriver");//Type-4

	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","Oracle2022");

	System.out.println("Connection Established");

	

	return con;

}

}

11:55 AM
import java.sql.SQLException;

import java.util.Scanner;



public class MainClass {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		

		Opreations operationObject = new Opreations();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for insert record:");

		System.out.println("Enter 2 for delete record:");

		System.out.println("Enter 3 for update record:");

		System.out.println("Enter 4 for displayOne record:");

		System.out.println("Enter 5 for displayAll record:");

		int reply = sc.nextInt();

		switch(reply) {

		case 1:

			operationObject.insert();

			break;

			

		case 2:

			operationObject.delete();

			break;

			

		case 3:

			operationObject.update();

			break;

			

		case 4:

			operationObject.displayOne();

			break;

			

		case 5:

			operationObject.displayAll();

			break;

			

			

		}

	}



}

11:55 AM
import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.Scanner;



public class Opreations {

	Scanner sc = new Scanner(System.in);

	public void insert() throws ClassNotFoundException, SQLException

	{

		ConnectionClass object = new ConnectionClass();

		Connection con =object.getConnection();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter student uid:");

		String stdUID = sc.next();

		System.out.println("Enter student name:");

		String stdName = sc.next();

		System.out.println("Enter student course:");

		String stdCourse = sc.next();

		System.out.println("Enter student batch:");

		int stdBatch = sc.nextInt();

		String insertQuery="insert into cuims values(?,?,?,?)";

		PreparedStatement psmt = con.prepareStatement(insertQuery);

		psmt.setString(1, stdUID);

		psmt.setString(2, stdName);

		psmt.setString(3, stdCourse);

		psmt.setInt(4, stdBatch);

		int reply = psmt.executeUpdate();

		System.out.println("No. of record updated:"+ reply);

		System.out.println("Record inserted successfully");

		psmt.close();

		con.close();

		

		

	}

	public void delete() throws ClassNotFoundException, SQLException

	{

		ConnectionClass object = new ConnectionClass();

		Connection con =object.getConnection();

		System.out.println("Enter Student UID for which record needs to delete:");

		String studentUID = sc.next();

		String searchQuery = "select * from cuims where stduid = ?";

		PreparedStatement psmt= con.prepareStatement(searchQuery);

		psmt.setString(1, studentUID);

		ResultSet rs = psmt.executeQuery();

		if(rs.next()) {

			System.out.println("Student UID:"+rs.getString(1));

			System.out.println("Student Name:"+rs.getString(2));

			System.out.println("Student Course:"+rs.getString(3));

			System.out.println("Student Batch:"+rs.getInt(4));

			System.out.println("Do you really want to delete record for:"+studentUID+"?(Yes/No)");

			String response = sc.next();

			if(response.equals("Yes")) {

				String deleteQuery="delete from cuims where stduid = ?";

				PreparedStatement psmt2= con.prepareStatement(deleteQuery);

				psmt2.setString(1, studentUID);

				int reply = psmt2.executeUpdate();

				System.out.println("Record deleted");

			}

		}

		else {

			System.out.println("No record found with Student UID:"+studentUID);

		}

		

		

		con.close();

		

		

	}

	public void update() throws ClassNotFoundException, SQLException

	{

		ConnectionClass object = new ConnectionClass();

		Connection con =object.getConnection();

		System.out.println("Enter Student UID for which record needs to update:");

		String studentUID = sc.next();

		String searchQuery = "select * from cuims where stduid = ?";

		PreparedStatement psmt= con.prepareStatement(searchQuery);

		psmt.setString(1, studentUID);

		ResultSet rs = psmt.executeQuery();

		if(rs.next()) {

			System.out.println("Student UID:"+rs.getString(1));

			System.out.println("Student Name:"+rs.getString(2));

			System.out.println("Student Course:"+

            */