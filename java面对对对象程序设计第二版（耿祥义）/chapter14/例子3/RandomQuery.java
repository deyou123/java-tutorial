import java.sql.*;
import java.util.*;
public class RandomQuery {
   String datasourceName="";        //����Դ��
   String tableName="";            //����
   int randomNumber;               //�������ļ�¼��
   ArrayList <StringBuffer> queryResult;  //��ѯ���
   public RandomQuery() {
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
   public void setRandomNumber(int n) {
      randomNumber=n;
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
           sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                    ResultSet.CONCUR_READ_ONLY);
           rs=sql.executeQuery("SELECT * FROM "+tableName);
           rs.last();
           int count=rs.getRow(); 
           Vector<Integer> vector=new Vector<Integer>();
           for(int i=1;i<=count;i++) {
               vector.add(new Integer(i));
           }
           int ��ȡ��Ŀ=Math.min(randomNumber,count);
           while(��ȡ��Ŀ>0) {
              StringBuffer record=new StringBuffer();
              int i=(int)(Math.random()*vector.size());
              int index=(vector.elementAt(i)).intValue();//vector�������ȡһ��Ԫ��
              rs.absolute(index);                        //�α��Ƶ���һ��
              for(int k=1;k<=�ֶθ���;k++) {
                 record.append(" "+rs.getString(k)+" ");
              }
              queryResult.add(record);
              ��ȡ��Ŀ--; 
              vector.removeElementAt(i); //����ȡ����Ԫ�ش�vector��ɾ��
            }
            con.close();
       }
       catch(SQLException e) {
           System.out.println("��������ȷ�ı���");
       }
       return queryResult;
   }    
}

