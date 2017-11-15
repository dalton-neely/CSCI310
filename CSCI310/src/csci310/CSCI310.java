/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csci310; 

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dalton
 */
public class CSCI310 {
    
    String url = "jdbc:sqlite:sample.db";
    Connection conn = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CSCI310 app = new CSCI310();
        app.run();
        // TODO code application logic here
    }
    
    public CSCI310(){
        conn = getConnection("jdbc:sqlite:sample.db");
    }

    public void run(){
        //conn = getConnection(url);
        createTable("CREATE TABLE IF NOT EXISTS classes (\n id integer,\n course text NOT NULL,\n students integer\n);");
        insertTable(480, "Theroy of Algorithms", 11);
//        selectAll();
//        updateCourse("Advanced JAVA", 480);
//        updateStudents(55, 480);
//        updateId(480, 310);
//        selectAll();
//        getCourseById(310);
//        getStudentsById(310);
//        getIdByCourse("Advanced JAVA");
//        deleteById(310);
//        query("DROP TABLE classes");
//        disconnect();
    }
    
    public void disconnect(){
        //System.out.println("<DISCONNECT>");
        try{
            conn.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    public boolean updateId(int _id, int _new){
        //System.out.println("<UPDATE> -> id");
        PreparedStatement pstmt = null;
        int affectedRows = 0;
        boolean returnValue = false;
        String sql = "UPDATE classes SET id=? WHERE id=?";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, _new);
            pstmt.setInt(2, _id);
            affectedRows = pstmt.executeUpdate();
            //System.out.println(affectedRows + " Rows Affected");
            if(affectedRows > 0){
                returnValue = true;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return returnValue;
        }
    }
    
    public boolean updateCourse(String _course, int _id){
        //System.out.println("<UPDATE> -> course");
        PreparedStatement pstmt = null;
        int affectedRows = 0;
        boolean returnValue = false;
        String sql = "UPDATE classes SET course=? WHERE id=?";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, _course);
            pstmt.setInt(2, _id);
            affectedRows = pstmt.executeUpdate();
            //System.out.println(affectedRows + " Rows Affected");
            if(affectedRows > 0){
                returnValue = true;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return returnValue;
        }
    }
    
    public boolean updateStudents(int _students, int _id){
        //System.out.println("<UPDATE> -> Students");
        PreparedStatement pstmt = null;
        int affectedRows = 0;
        boolean returnValue = false;
        String sql = "UPDATE classes SET students=? WHERE id=?";
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, _students);
            pstmt.setInt(2, _id);
            affectedRows = pstmt.executeUpdate();
            //System.out.println(affectedRows + " Rows Affected");
            if(affectedRows > 0){
                returnValue = true;
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return returnValue;
        }
    }
    
    public Connection getConnection(String _url){
        //System.out.println("<GET CONNECTION>");
        try{
            conn = DriverManager.getConnection(_url);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        if(conn != null){
            System.out.println("Connection made to " + _url);
        }else{
            System.out.println("Conection not made");
        }
        return conn;
    }
    
    public boolean query(String _sql){
        //System.out.println("<QUERY> -> " + _sql);
        Statement stmt = null;
        boolean result = false;
        try{
            stmt = conn.createStatement();
            result = stmt.execute(_sql);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                stmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return result;
        }
        //return result;
    }
    
    public boolean createTable(String _sql){
        //System.out.println("<CREATE TABLE>");
        Statement stmt = null;
        boolean returnValue = false;
        try{
            stmt = conn.createStatement();
            returnValue = stmt.execute(_sql);
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try{
                stmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return returnValue;
        }
    }
    
    public void insertTable(int _id, String _course, int _students){
        //System.out.println("<INSERT>");
        PreparedStatement pstmt = null;
        int affectedRows = 0;
        try{
            pstmt = conn.prepareStatement("INSERT INTO classes(id, course, students) VALUES(?,?,?)");
            pstmt.setInt(1, _id);
            pstmt.setString(2, _course);
            pstmt.setInt(3, _students);
            affectedRows = pstmt.executeUpdate();
            //System.out.println(affectedRows + " Rows Affected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
    public boolean deleteById(int _id){
        //System.out.println("<DELETE>");
        PreparedStatement pstmt = null;
        int affectedRows = 0;
        boolean returnValue = false;
        try{
            pstmt = conn.prepareStatement("DELETE FROM classes WHERE id=?");
            //pstmt.setString(1, _table);
            pstmt.setInt(1, _id);
            affectedRows = pstmt.executeUpdate();
            //System.out.println(affectedRows + " Rows Affected");
            if(affectedRows == 1){
                returnValue = true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
            return returnValue;
        }
    }
    
    public String getCourseById(int _id){
        //System.out.println("<GET COURSE BY ID>");
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT course FROM classes WHERE id=?";
        String result = null;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, _id);
            rs = pstmt.executeQuery();
            rs.next();
            result = rs.getString("course");
            //System.out.println(result);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
                rs.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public int getStudentsById(int _id){
        //System.out.println("<GET STUDENTS BY ID>");
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT students FROM classes WHERE id=?";
        int result = 0;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, _id);
            rs = pstmt.executeQuery();
            rs.next();
            result = rs.getInt("students");
            //System.out.println(result);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
                rs.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public int getIdByCourse(String _course){
        //System.out.println("<GET ID BY COURSE>");
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "SELECT id FROM classes WHERE course=?";
        int result = 0;
        try{
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, _course);
            rs = pstmt.executeQuery();
            rs.next();
            result = rs.getInt("id");
            //System.out.println(result);
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                pstmt.close();
                rs.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
    
    public void selectAll(){
        //System.out.println("<SELECT>");
        String sql = "SELECT * FROM classes";
        Statement stmt = null;
        ResultSet rs = null;
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt("id") + "\t" + rs.getString("course") + "\t" + rs.getInt("students"));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally{
            try{
                stmt.close();
                rs.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    
}
