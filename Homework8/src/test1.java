
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


public class test1 {

	public static void main(String[] args) {
		book books1 = new book(1001, "Java", 888.0, "Sun出版社");
        book books2 = new book(1002, "Python", 257.0, "Python出版社");
        book books3 = new book(1003, "C++", 155.0, "C++出版社");
        ArrayList<book>bookList=new ArrayList<book>();
        bookList.add(books1);
        bookList.add(books2);
        bookList.add(books3);
        Iterator<book> iter=bookList.iterator();
        while(iter.hasNext()) {
        	book tempbook=(book)iter.next();
        	System.out.println(tempbook.getNum()+" "+tempbook.getName()+" "+tempbook.getPrice()+" "+tempbook.getPress());
        }
        HashMap<Integer, book> bookHashMap=new HashMap<>();
        bookHashMap.put(books1.getNum(), books1);
        bookHashMap.put(books2.getNum(), books2);
        bookHashMap.put(books3.getNum(), books3);
        Set<Integer>key=bookHashMap.keySet();
        for(Integer i:key) {
        	System.out.println(i+" "+bookHashMap.get(i).getName()+' '+bookHashMap.get(i).getPrice()+" "+bookHashMap.get(i).getPress());
        }
      
	}
	

}
class book{
	private int number;
	private String name;
	private double price;
	private String press;
	public book() {
		
	}
	book(int a,String b,double c,String d){
		super();
		this.number=a;
		this.name=b;
		this.price=c;
		this.press=d;
	}
	int getNum() {
        return number;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    String getPress() {
        return press;
    }
	
}