package jdbcexample;
import java.sql.*;

public class ExampleJdbcConnect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String Url="jdbc:mysql://localhost:3306/aliens";
		String userName="root";
		String Password="Dinesh@15";
		int id=6;
		String name="gill";
		String query="insert into student(id,name) values(?,?)";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection(Url,userName,Password);
		PreparedStatement st=connection.prepareStatement(query);
		st.setInt(1,id);
		st.setString(2, name);
		int count=st.executeUpdate();
		System.out.println("if its displayed "+count +"then its a success");

		st.close();
		connection.close();
		
		
		
		

	}

}
