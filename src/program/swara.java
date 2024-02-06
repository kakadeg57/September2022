package program;

public class swara {
 void input() {
	 System.out.println("enter your name");
 }
	
}
class swaraj extends swara
{
	void show()
	{
		System.out.println("my name is anjali");
	}
}
class manoj extends swara
{
	void disp()
	{
		System.out.println("my name is sita");
	}
}
class demo
{
	public static void main(String[] args) {
		swaraj r = new swaraj();
		manoj r2 = new manoj();
		r.show();
		r2.disp();
	}
}