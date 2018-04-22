package check;  
  
/** 
 * 
 * @author itwang 
 */  
import java.sql.*;



public class Check {  
     public static final String URL = "jdbc:mysql://127.0.0.1/javatest?characterEncoding=utf8";  
    public static final String NAME = "com.mysql.jdbc.Driver";  
    public static final String USER = "root";  
    public static final String PASS= "123456";  
    public static String sql = null;  

 public  Connection conn = null;  
  public   ResultSet rs = null;  

     public  static boolean checkreturn(String account,String password){  
         Check a = new Check();
           boolean checkbool = false;  
         try {
              Class.forName(NAME);  
              a.conn = (Connection) DriverManager.getConnection(URL, USER, PASS);  
         sql = "select * from users where  username=? and password=?;";
         PreparedStatement ps = a.conn.prepareStatement(sql);
        ps.setString(1, account);
        ps.setString(2, password);
          a.rs=ps.executeQuery();
             if (a.rs.next()) {
                 checkbool = true;
             }
            
         } catch (Exception e) {
              e.printStackTrace();  
         }
     
finally{  
            //最后一定要关闭链接  
            if (a.conn != null){  
                try {  
                    a.conn.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            if(a.rs != null){  
                try {  
                    a.rs.close();  
                } catch (SQLException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
        }
         
         
         return checkbool; 
     }
}
   

          
   
