
//2] Program for extending the interface.

public interface SYIT 
{
	int strength =68;
	void displaySecond();
}
interface TYIT extends SYIT
{
	int strength =55;
	void displayThird();
	void displayAll();
}
class Infotech implements TYIT
{
	int Total;
	public void displaySecond()
	{
		System.out.println("SYIT : "+SYIT.strength);
	}
	public void displayThird()
	{
		System.out.println("TYIT : "+TYIT.strength);
	}
	public void displayAll()
	{
		Total=SYIT.strength + TYIT.strength;
		System.out.println("Total : "+Total);
	}
}