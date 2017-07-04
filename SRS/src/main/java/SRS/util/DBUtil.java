package SRS.util;


import java.sql.*;

public class DBUtil {
	private static final long serialVersionUID = 1L;
	  private static String  dbName;
	public static Connection getSqliteConnection(){
		String driver="org.sqlite.JDBC";
		String conStr="jdbc:sqlite::resource:db/SRS.db";
		Connection conn=null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(conStr);
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;			
	}
	
	
	public static boolean executeUpdate(String sql,Object[] args){
		boolean sign=false;
		 Connection conn=null;
		 PreparedStatement pst=null;
		 try{
			 conn=DriverManager.getConnection(dbName);
			 pst=conn.prepareStatement(sql);
			 if(args!=null&&args.length>0){
				 for(int i=0;i<args.length;i++){
					 pst.setObject(i+1, args[i]);
				 }
			 }
			 int rows=pst.executeUpdate();
			 sign=rows>0?true:false;
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return sign;
	 }
	public static ResultSet executeQuery(String sql,Object[] args){
		Connection conn=null;
		 PreparedStatement pst=null;
		 ResultSet rs=null;
		 try{
			 conn=DriverManager.getConnection(dbName);
			 pst=conn.prepareStatement(sql);
			 if(args!=null&&args.length>0){
				 for(int i=0;i<args.length;i++){
					 pst.setObject(i+1, args[i]);
				 }
			 }
			 rs=pst.executeQuery();
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 return rs;
	 }
	public static void closeAll(ResultSet rs,Statement st,Connection conn){
		 try{
			 if(rs!=null) rs.close();
			 if(st!=null) st.close();
			 if(conn!=null) conn.close();
		 }catch(SQLException e){
			 e.printStackTrace();
		 }
	 }
	
}
