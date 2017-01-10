package dao;

import java.sql.Array;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import entity.Student;

public class StudentDao {
	private String urlDerby="jdbc:derby://localhost:1527/myeclipse;create=true";
	private String classDerby="org.apache.derby.jdbc.ClientDriver";
	private Connection conn=null;
	private PreparedStatement strm=null;
	public void creadconnection(){
		try {
			Class.forName(classDerby);
			try {
				conn=DriverManager.getConnection(urlDerby);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addStudent(Student student){
		String sql="insert into STUDENT values("+student.getSid()+",'"+student.getSname()+"',"+student.getSage()+")";
		try {
			strm=conn.prepareStatement(sql);
			strm.executeUpdate();
			System.out.println("插入学生成功！！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void creatDb(){
		try {
			strm=conn.prepareStatement("create table STUDENT(sid INTEGER PRIMARY KEY,"+"sname VARCHAR(10),sage INTEGER)");
			strm.executeUpdate();
			System.out.println("建表成功！！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeAll(){

		if(strm!=null){
			try {
				strm.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	}
	public List<Student> findAll(){
		String sql="select * from STUDENT";
		
		try {
			strm=conn.prepareStatement(sql);
			ResultSet resultSet=strm.executeQuery();
			ArrayList<Student> list=new ArrayList<Student>();
			while(resultSet.next()){
				Student s=new Student();
				s.setSid(resultSet.getInt(1));
				s.setSname(resultSet.getString(2));
				s.setSage(resultSet.getInt(3));
				list.add(s);
				
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDao dao=new StudentDao();
		dao.creadconnection();
		//dao.creatDb();
		/*
		Student stu1=new Student(1,"张三",20);
		Student stu2=new Student(2,"李四",21);
		Student stu3=new Student(3,"王麻子",22);
		dao.addStudent(stu1);
		dao.addStudent(stu2);
		dao.addStudent(stu3);
		*/
		List<Student> list= dao.findAll();
		for(Student s :list)
			System.out.println("学号："+s.getSid()+"\n姓名:"+s.getSname()+"\n年龄："+s.getSage());
		dao.closeAll();
	}

}
