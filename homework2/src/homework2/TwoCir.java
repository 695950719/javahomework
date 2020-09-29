package homework2;
import java.util.*;
public class TwoCir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);  
        System.out.println("第一个圆的x坐标：");
        int x1=scan.nextInt();
        System.out.println("第一个圆的y坐标：");
        int y1=scan.nextInt();
        System.out.println("第一个圆的半径：");
        int r1=scan.nextInt();
        System.out.println("第二个圆的x坐标：");
        int x2=scan.nextInt();
        System.out.println("第二个圆的y坐标：");
        int y2=scan.nextInt();
        System.out.println("第二个圆的半径：");
        int r2=scan.nextInt();
        int rMin=(int) Math.pow(r1-r2,2);
        int rMax=(int) Math.pow(r1+r2,2);
        int copyR=(int)(Math.pow(x1-x2,2)+Math.pow(y1-y2, 2));
        if(rMin>copyR&&r2<r1)
        {
            System.out.println("第二个圆在第一个圆内");
        }
        else if(copyR>rMin&&copyR<rMax){
            System.out.println("两圆相交");
        }

	}

}
