
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayObject(new CircleFromSimpleCeometricObject(1,"red",false));
		displayObject(new RectangleFromSimpleCeometricObject(1,1,"black",false));
	}
	public static void displayObject(SimpleGeometricObject object) {
		System.out.println("created on "+object.getDateCreated()+" color is "+object.getColor());
	}

}
