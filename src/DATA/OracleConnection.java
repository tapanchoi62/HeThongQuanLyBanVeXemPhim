
package DATA;

import java.sql.Connection;
import java.sql.DriverManager;

public  class OracleConnection {
    protected Connection con=null;

      public OracleConnection()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");  
            String StrCon="jdbc:oracle:thin:@localhost:1521/orcl";
            con=DriverManager.getConnection(StrCon, "phuong", "123");
            if(con!=null)
            {
                System.out.println("Kết nối thành công");
            }
            else
            {
                System.out.println("Kết nối thất bại");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
          }   
    }
     
     public static void main(String[]args)
     {
         OracleConnection con = new OracleConnection();
     }
}
