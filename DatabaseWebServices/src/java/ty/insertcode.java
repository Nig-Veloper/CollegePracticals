/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ty;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
/**
 *
 * @author Administrator
 */
@WebService(serviceName = "insertcode")
public class insertcode {

    @WebMethod(operationName = "insert")
 public String insert(@WebParam(name = "sname") String sname, @WebParam(name = "srollno") 
String srollno, @WebParam(name = "sclass") String sclass) {
 try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection 
    con=DriverManager.getConnection("jdbc:mysql://localhost:3308/webservices","root","");
 PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?)");
 stmt.setString(1,sname);
 stmt.setString(2,srollno);
 stmt.setString(3,sclass);
 int i=stmt.executeUpdate();
 con.close();
 return i+" Record(s) Inserted!";
 }
 catch(Exception e){return e+"Error";}
 }

}
