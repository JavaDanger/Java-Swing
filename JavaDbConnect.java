
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JavaDbConnect {
   Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:Easystat.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");

            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }  
}
