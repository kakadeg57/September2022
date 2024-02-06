package program;

public class Shape {
	
	void draw() 
	{
		 System.out.println("can not say shape");
	}
	
}
class squre extends Shape{
	@Override
	void draw() {
		System.out.println("squre");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
squre s = new squre();
s.draw();
	}

}

