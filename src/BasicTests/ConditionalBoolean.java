package BasicTests;

public class ConditionalBoolean {

	public static void main(String[] args) {


		
		int x= 11;
		int y=15;
		
		boolean z =(x==y);
		boolean test=(x>y);
		boolean testone= (x<y);
		
		if(z){
			System.out.println("x is equal to y");
		}
		
		if (test) {
			
			System.out.println("x is greater than y");
		}
		
		if(testone) {
			
			System.out.println("x is less than y");
		}
		
		System.out.println("out of the conidition");
		

	}

}
