package jdbcexample.withDoClass;

import java.sql.*;;

public class DaoClass {
	Connection connection=null;
	String Url="jdbc:mysql://localhost:3306/aliens";
	String userName="root";
	String Password="Dinesh@15";
	
	public void Database_Connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(Url,userName,Password);
	}
	
	public Student getStudent_Given_id(int id) throws SQLException, ClassNotFoundException
	{
		Student student=new Student();
		String query="select * from student where id="+id;
		 Database_Connect() ;
		System.out.println(connection);
		
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		
		
	return student;
		
	}
	public void Add_Student_GivenStudent(Student student) throws SQLException
	{
		
		String query="insert into student(id,name) values (?,?)";
		PreparedStatement ps=connection.prepareStatement(query);
		ps.setInt(1, student.getId());
		ps.setString(2,student.getName());
		int count=ps.executeUpdate();
		System.out.println("query status is "+count);
		
	}
	
	

}
