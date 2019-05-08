import java.sql.*;
import java.util.*;
public class Query {
   String datasourceName="";        //����Դ��
   String tableName="";            //����
   String SQL;                     //SQL���
   ArrayList <StringBuffer> queryResult;  //��ѯ���
   public Query() {
      try{  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
      }
      catch(ClassNotFoundException e) {
         System.out.print(e);
      }
   }
   public void setDatasourceName(String s) {
      datasourceName=s.trim();
   }
   public void setTableName(String s) {
      tableName=s.trim();
   }
   public void setSQL(String SQL) {
      this.SQL=SQL;
   }
   public ArrayList <StringBuffer> getQueryResult() {
      queryResult=new ArrayList<StringBuffer>(); 
      Connection con;
      Statement sql; 
      ResultSet rs;
      try { 
           String uri="jdbc:odbc:"+datasourceName; 
           String id="";
           String password="";
           con=DriverManager.getConnection(uri,id,password);
           DatabaseMetaData metadata=con.getMetaData();
           ResultSet rs1=metadata.getColumns(null,null,tableName,null);
           int �ֶθ���=0;
           while(rs1.next()) {
              �ֶθ���++;
           }
           sql=con.createStatement();
           rs=sql.executeQuery(SQL);
           while(rs.next()) {
             StringBuffer record=new StringBuffer();
             for(int k=1;k<=�ֶθ���;k++) {
                 record.append(" "+rs.getString(k)+" ");
             }
             queryResult.add(record);
           }
           con.close();
       }
       catch(SQLException e) {
           System.out.println("��������ȷ�ı���");
       }
       return queryResult;
   }    
}

