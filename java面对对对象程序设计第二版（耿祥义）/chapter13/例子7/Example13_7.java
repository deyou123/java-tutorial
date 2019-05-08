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
      Book book1=new Book("7302033218","Java面向对象程序设计"),
           book2=new Book("7808315162","JSP程序设计"),
           book3=new Book("7302054991","Java设计模式");
       HashMap<String,Book> table=new HashMap<String,Book>();
       table.put(book1.ISBN,book1); 
       table.put(book2.ISBN,book2);
       table.put(book3.ISBN,book3);  
       String key="7808315162";
       if(table.containsKey(key)) {
           Book book=table.get(key);
           System.out.println(book.name+" 有货");
       }
       int number=table.size();
       System.out.println("散列映射中有"+number+"个元素:");
       Collection<Book>  collection=table.values();
       Iterator<Book> iter=collection.iterator();
       while(iter.hasNext()) {
          Book te=iter.next();
          System.out.printf("书名:%s,ISBN:%s\n",te.name,te.ISBN);
       }
   }
}



