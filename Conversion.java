
// 1] program for interface for implementation.

interface Conversion 
{
	double Gm_to_Kg=1000;
	double gm_to_kg (double gm);
	double kg_to_gm (double kg);
}
class Convert implements Conversion
{
	public double gm_to_kg (double gm)
	{
		return gm/Gm_to_Kg;
	}
	public double kg_to_gm (double kg)
	{
		return kg*Gm_to_Kg;
	}
}
