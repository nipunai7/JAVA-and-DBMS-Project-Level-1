/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author nipun
 */
public class NewClass {
    
    private static final String UNAME = "root";
    private static final String PWORD = "Samsungpl120";
    private static final String CONNSTRING = "jdbc:mysql://localhost:3306/test";
    
   
    public static void main(String args[]){
        test();
    }
    
    public static int test(){
         Connection conn = null; 
        int count = 0;
        String mnk = null;
        try{
                    conn = DriverManager.getConnection(CONNSTRING,UNAME,PWORD);
                    System.out.println("Connected");
//                    Statement send = (Statement) conn.createStatement();
//                    String insert = "SELECT uname FROM test1 WHERE uname = 'nipunai7'";
//                    ResultSet rs = send.executeQuery(insert);
//                    mnk = rs.getString(1);
                        Statement statement = conn.createStatement();
 ResultSet resultSet = statement.executeQuery("select count(*) from test1");

 while (resultSet.next()) {
 return resultSet.getInt("uname");
 }
  
}catch (SQLException e){
            
}  
        return 0;

    } 

}
