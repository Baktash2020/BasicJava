package BasicTests;

public class TestFunction {

	public static void main(String[] args) {
		
		FunctionsTest FT = new FunctionsTest();
		
		FT.addtwoNumber(10, 6);
		
		FT.addtwoNumber(99, 89);
		
		int z = FT.addtwoNumber(555, 40);
		System.out.println(z);
		
		
		int P = FT.addtwoNumber(10, 40);
		System.out.println(P);
	}
		
		public boolean compare (int numberone, int numbertwo) {
			
			boolean test=true;
			
			if(numberone>numbertwo) {
				
				test=true;
			}
			
         
			return true;
			
			
		}
		
		
		

	}


