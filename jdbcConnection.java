/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice_billing_system;


import java.sql.*;
import javax.swing.*;
public class jdbcConnection {
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/invoice"/*invoice is the name of the database and the table in .sql file must be created in it */,"root","");
            System.out.println("CONNECTION ESTABLISHED");
            return conn;
        
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, e);
            return null;
        }
    }
    
}