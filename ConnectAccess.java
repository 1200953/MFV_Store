import java.sql.*;  
public class ConnectAccess {  
    private Connection conn;
    private Statement stmt;
    
    public void CloseAccessFile() throws Exception   
    {  
        stmt.close();
        conn.close();
    }   
    
    public void OpenAccessFile() throws Exception   
    {  
        Class.forName("com.hxtt.sql.access.AccessDriver"); 
        //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
        String path = this.getClass().getClassLoader().getResource("MyDB.mdb").getPath().substring(1);
        
        String url="jdbc:Access:///"+path;
        conn = DriverManager.getConnection(url);  
        stmt = conn.createStatement();  
    }   
    
    public boolean  GetUserMsg(Account account) throws Exception   
    {
        int rowcount =0;
        String strsql="";
        strsql +="select * from Account where [name]='" + account.verifyid+"' and password ='"+account.password+"'";
        ResultSet rs = stmt.executeQuery(strsql);
        
        while (rs.next()) 
        {  
            account.verifyid=rs.getString(1);  
            account.password=rs.getString(2);  
            account.level=rs.getString(3);  
            account.author=rs.getString(4);  
            rowcount++;
        }  
        rs.close();  
        return rowcount>0?true:false;
    }   
    
    public ResultSet  GetSet(String str) throws Exception   
    {
        ResultSet rs = stmt.executeQuery(str);
        return rs;
    }   
    
    public boolean  SaveMsg(String str) throws Exception   
    {
        int rowcount =0;
        rowcount = stmt.executeUpdate(str);
        return rowcount>0?true:false;
    } 
    
    
    
    public boolean  UpdateMsg(String str) throws Exception   
    {
        int rowcount =0;
        rowcount = stmt.executeUpdate(str);
        return rowcount>0?true:false;
    } 
    
}  