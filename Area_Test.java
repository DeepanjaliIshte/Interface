
public class Area_Test 
{
	public static void main(String[] args) 
	{
		// create object of class which implements the interface
		Rectangle rect =new Rectangle();
		Circle Cir = new Circle();
		Object Area = rect; // area refers to the rect object 
		System.out.println("Area of Rectangle = "+((Rectangle) Area).compute(10,20));
		Area=Cir; // area referes to the cir object
		System.out.println("Area of Circle = "+((Rectangle) Area).compute(10,0));
	}
}
