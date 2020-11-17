
public class TestCircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleFromSimpleCeometricObject circle = new CircleFromSimpleCeometricObject(1);
		System.out.println("the perimeter is "+circle.getDiameter());
		RectangleFromSimpleCeometricObject rectangle=new RectangleFromSimpleCeometricObject(2,4);
		System.out.println("the area is "+rectangle.getArea());
	}

}
