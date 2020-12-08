import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Set<student>stuset= new TreeSet<student>();
		while(true) {
			System.out.println("请输入学生信息:(学号 姓名 年龄)");
			String inputdata=input.nextLine();
			if("exit".equals(inputdata))
				break;
			String[] info=inputdata.split(" ");
			student stu=new student(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]));
			stuset.add(stu);
		}
		Iterator<student> it=stuset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}

	}

}
class student implements Comparable<student>{
	private int number;
	private String name;
	private int age;
	public student() {
		// TODO Auto-generated constructor stub
	}
	student(int a,String b,int c){
		super();
		this.number=a;
		this.name=b;
		this.age=c;
	}
	int getNumber() {
		return number;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	public int compareTo(student stu) {
	    return this.age - stu.age;
	  }
	public String toString() {
		return "Student [age=" + age + ", name=" + name + 
				", number=" + number + "]";
	}
	
}