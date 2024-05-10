

	// Q.19] Implementation of interface as class type. In this program interface area is created and it
 // is implemented in two different classes Rectangle and Circle. Instance of each class is created using new operator.
// Then declare The object of type Area interface class and now assign the reference to the rectangle object rect to area. 
 // When compute method of area is called, the compute method of Rectangle class is invoked.

public interface Area 
{

			final static float pi=3.14f;
			static float  compute(float x, float y) 
			{
				return 0;
			}	// Abstract method
		}
		class Rectangle implements Area	//interface is implemented
		{
			public float compute (float x, float y)
			{
				return(x*y);
			}
		}
		class Circle implements Area	//another interface is implemented
		{
			public float compute (float x, float y)
			{
				return(pi*x*y);
			}
		
	}
