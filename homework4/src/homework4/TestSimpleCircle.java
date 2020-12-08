package homework4;

public class TestSimpleCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("the area of the circle of radius "+circle1.radius+" is "+circle1.getArea());

		SimpleCircle circle2 = new SimpleCircle(125);
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		circle2.setRadius(100);
		System.out.println("the area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
		circle2.setRadius(100);
	}

}
class SimpleCircle {
	
	double radius;
	SimpleCircle(){
		radius=1;
	}
	
	SimpleCircle(double newRadius){
		radius=newRadius;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}
	
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
