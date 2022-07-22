/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ty;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "WeatherAPI")
public class WeatherAPI {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "fetchWeather")
    public String fetchWeather(@WebParam(name = "cityName") String cityName) {
       
        try {
            String info = "";
            String sql = String.format("Select * from WeatherData where city = '%s' ", cityName);
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaAPI","root","root");
            
            ResultSet rs = conn.createStatement().executeQuery(sql);
            
            
            while(rs.next()){
                    info = info+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3);  //1,2,3 are columns of the table
            }
            return info;
        }
        catch(Exception e){
            return e.toString();
        }
    }
    
    
    
}
