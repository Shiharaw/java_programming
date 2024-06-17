package Java_day9;

public class ThisKeyword {
	
	int x,y;	//Instance variables/class variables
	
	//Method
	void setData(int x, int y) {	//Local variables/ method variables
	
		//This keyword using to represent class variables
		this.x=x;
		this.y=y;
	}
	
	//Constructor
	ThisKeyword(int x, int y) {
		
		//This keyword using to represent class variables
		this.x=x;
		this.y=y;
	}
	
	
	void display() {
		
		System.out.println(x);
		System.out.println(y);
	}
	
	

	public static void main(String[] args) {
		
		//ThisKeyword th =new ThisKeyword();	//Method
		ThisKeyword th= new ThisKeyword(14, 14);	//Constructor
		
		//th.setData(12, 13);		//Method
		th.display();				//Method and Constructor both
		

	}

}
