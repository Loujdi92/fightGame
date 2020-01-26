package ppe2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {

	
	Statement stmt=null;
    Connection dbcon=null;
    
    public  void Connect() {
    	
    	
    	try {
    		
    		Class.forName("org.postgresql.Driver");
    		
    		String dbUrl="jdbc:postgresql://localhost:5432/PPE2";
    		
    		String user = "postgres";
	
    		String password = "mourad92.000";
    		

			dbcon = DriverManager.getConnection(dbUrl, user, password);
			System.out.println("Connected");
            
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}
}