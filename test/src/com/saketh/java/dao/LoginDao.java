package com.saketh.java.dao;

import java.sql.*;
public class LoginDao {

//	//String db="bhai";
//	String url="jdbc:mysql://localhost:3306/agm_db";
//	String username="root";
//	String password="root";
//	
//	String sql="select * from basic_cred where uname=? and pass=? ";

	
	public boolean check(String uname1,String upass1) throws Exception
	{
		try {
			System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select * from basic_cred where uname=? and upass=?";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			st.setString(1,uname1);
			st.setString(2,upass1);
			
			ResultSet rs=st.executeQuery();
			//rs.next();
			
			System.out.println(rs);
			if(rs.next())
			{
				
				System.out.println(" inside rs.next() a,b ");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    
				return true;
			}
			else
			{
				System.out.println("check  dude: ");
				return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return false;
	}

	
	public boolean check(String uname1,String upass1,int c) throws Exception
	{
		try {
			//System.out.println(" inside check bro");
			String db="agm_db";
			String username="root";
			String password="root"; 
			String url="jdbc:mysql://localhost:3306/"+db+"?user"+username+"&password"+password+"&useUnicode=true&characterEncoding=UTF-8";
			//String query="select uname from basic_cred where uname= "+uname1+"   + 'and' + upass="+upass1+"   ";
			String query="select * from basic_cred where uname=? and upass=? and isAdmin=1";
			//String query="select * from alien where aid=  '"+aid+"' ";
		//	String query="select * from alien";
			Class.forName("com.mysql.cj.jdbc.Driver");
			              //com.mysql.jdbc.Driver
			Connection con=DriverManager.getConnection(url, username, password);
			 //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root", "root", "root");
			PreparedStatement st= con.prepareStatement(query);
			//Statement st=con.createStatement();
			st.setString(1,uname1);
			st.setString(2,upass1);
			ResultSet rs=st.executeQuery();
			//rs.next();
			
			if(rs.next())
			{
				
				System.out.println(" inside rs.next() a,b,c");
//				a.setAid(rs.getInt("aid"));
//				a.setAname(rs.getString("aname"));
//				a.setCourse(rs.getString("course"));
			    
				return true;
			}
			else
			{
				System.out.println("check  44 dude: ");
				return false;
			}
			//return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	
		
		return false;
	}





}


		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection(url,username,password);
//	    PreparedStatement st=con.prepareStatement(sql);
//	    st.setString(1, uname);
//	    st.setString(2,upass);
//	    ResultSet rs=st.executeQuery();
//	    if(rs.next())
//	    {
//	    	return true;
//	    }
	    
	    
	    
		




	
	


