package by.htp.afisha.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RunnerDb {

	public static void main(String[] args) {
		Connection connection = null;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myafisha", "root", "root");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from event;");
		while (rs.next()){
			String title = rs.getString("title");
			String date= rs.getString("date");
			System.out.println(title + "||" + date);
		}
		String sqll = "INSERT INTO film (rating, fk_genre, fk_eventFilm) VALUES (?,?,? )";
		
			PreparedStatement ps = connection.prepareStatement(sqll);
			ps.setDouble(1, 6.5);
			ps.setInt(2, 3);
			ps.setInt(3, 9);
			ps.executeUpdate();
			
			sqll = "DELETE FROM film WHERE id_film=?";
			ps  = connection.prepareStatement(sqll);
			
			ps.setInt(1, 4);
			
	       ps.executeUpdate();
	 
		}catch (ClassNotFoundException|SQLException  e){
			e.printStackTrace();
		} finally {
			
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
}
