import java.util.*;
class Book {
    String ISBN,name;
    Book(String ISBN,String name) {
       this.name=name;
       this.ISBN=ISBN;
    }
}
public class Example13_7 {
   public  static void main(String args[]) {
      Book book1=new Book("7302033218","Java�������������"),
           book2=new Book("7808315162","JSP�������"),
           book3=new Book("7302054991","Java���ģʽ");
       HashMap<String,Book> table=new HashMap<String,Book>();
       table.put(book1.ISBN,book1); 
       table.put(book2.ISBN,book2);
       table.put(book3.ISBN,book3);  
       String key="7808315162";
       if(table.containsKey(key)) {
           Book book=table.get(key);
           System.out.println(book.name+" �л�");
       }
       int number=table.size();
       System.out.println("ɢ��ӳ������"+number+"��Ԫ��:");
       Collection<Book>  collection=table.values();
       Iterator<Book> iter=collection.iterator();
       while(iter.hasNext()) {
          Book te=iter.next();
          System.out.printf("����:%s,ISBN:%s\n",te.name,te.ISBN);
       }
   }
}



