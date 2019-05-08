import java.sql.*;
import java.util.*;
public class RandomQuery {
   String datasourceName="";        //数据源名
   String tableName="";            //表名
   int randomNumber;               //随机输出的记录数
   ArrayList <StringBuffer> queryResult;  //查询结果
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
           int 字段个数=0;
           while(rs1.next()) {
              字段个数++;
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
           int 抽取数目=Math.min(randomNumber,count);
           while(抽取数目>0) {
              StringBuffer record=new StringBuffer();
              int i=(int)(Math.random()*vector.size());
              int index=(vector.elementAt(i)).intValue();//vector中随机抽取一个元素
              rs.absolute(index);                        //游标移到这一行
              for(int k=1;k<=字段个数;k++) {
                 record.append(" "+rs.getString(k)+" ");
              }
              queryResult.add(record);
              抽取数目--; 
              vector.removeElementAt(i); //将抽取过的元素从vector中删除
            }
            con.close();
       }
       catch(SQLException e) {
           System.out.println("请输入正确的表名");
       }
       return queryResult;
   }    
}

