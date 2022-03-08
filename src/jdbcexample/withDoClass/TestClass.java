package jdbcexample.withDoClass;

import java.sql.SQLException;

public class TestClass {
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		DaoClass dao=new DaoClass();
		Student student = dao.getStudent_Given_id(1);
		System.out.println(student);
		Student student1=new Student(7,"aditya");
		dao.Add_Student_GivenStudent(student1);
	}

}
