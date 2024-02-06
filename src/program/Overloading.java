package program;

public class Overloading {
	 
	void add() {
		 int a=10,b=20,c;
		 c = a+b;
		 System.out.println(c);
	}
	void add(int x, int y){
		int c ;
		c=x+y;
		System.out.println(c);
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o = new Overloading();
o.add();
o.add(10, 40);

	}

}
