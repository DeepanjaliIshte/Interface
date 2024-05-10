// 3] Program for nested interface. 

interface Showable
{
	void show();
	interface Message
	{
		void msg();
	}
}
class Test1 implements Showable.Message
{
	public void msg()
	{
	System.out.println("Hello Nested interface ");
	}
	public static void main(String args[]) 
	 { 
	 Showable.Message message=new Test1();	//upcasting here 
	 message.msg(); 
	 } 
 }



