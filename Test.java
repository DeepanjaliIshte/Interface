
 interface Test
{
	void Show();
}
 
 interface Test2
 {
	 void display();
 }
 
class Test3 implements Test,Test2
 {
	@Override
	public void Show() {
		System.out.println("1");
	}
	
	 public void display()
	 {
		 System.out.println("2");
	 }
	 public static void main (String[] Args)
	 {
		 Test3 t3=new Test3();
		 t3.Show();
		 t3.display();
	 }
}
