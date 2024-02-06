package program;




	 class constructor {
		 public static void main(String[] args) {
				
				B ref= new B(10 ,20);
				ref.show();
				
		 }
		   
	}
	class B{
		
		
			
			int x,y;
			
			B(int a ,int b)
			{
				int x=10,y=20;
			}
			void show() 
			{
				System.out.print(x+""+y);
			}
		}

