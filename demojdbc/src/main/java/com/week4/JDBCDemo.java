package com.week4;
import java.sql.*;
  
public class JDBCDemo {
    
    public static void main(String args[]) throws SQLException {

      // database url + credentials
        String url = "jdbc:mysql://localhost:3306/example";
        String username = "root";
        String password = "8891";

        // Obtain a connection using credentials
        try(Connection con = DriverManager.getConnection(
          url, username, password);

          // create a Statement object
          Statement st = con.createStatement();){
            // Execute the query using the Statement object
          String query = "INSERT INTO example_table VALUES (2, 'hi')";
          int rowsUpdated = st.executeUpdate(query);
          
          System.out.println(rowsUpdated); // 1

          // Closing the connection
          con.close();
        }catch (SQLException e){
          System.err.println("SQL Exception: " + e.getMessage());
        }
        

        
    }
} // class