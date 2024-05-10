
public class Conver_1 
{
	public static void main(String[] args) 
	{
		Convert obj =new Convert();
		Conversion c;
		c = obj;
		System.out.println("2000 gm = "+c.gm_to_kg(2000)+ " kg ");
		System.out.println("50 kg = "+c.kg_to_gm(50) + " gm ");
	}
}
