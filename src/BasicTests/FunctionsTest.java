package BasicTests;

public class FunctionsTest {
	
	
	
	public int addtwoNumber(int x, int y) {
		
		int sum = x+y;
		
		return sum;
		
	}
		public void printValue (String name) {
			System.out.println(name);
			
		
	}
		
		public static void addthreeNumber(int x, int y, int z){
			
			int sum = x+y+z;
			System.out.println(sum);
		}
		
		
		public boolean compare ( int numberone, int numbertwo){
			
			boolean test=true;
			
			if(numberone>numbertwo){
				test=true;
				
			}
			
			else {
				test=false;
			}
			return true;
			
		}
		
		public String concat(String x1, String x2) {
			
			String add = x1 + "" + x2;
			System.out.println(add);
			
			return add;
			
		}
		
		

}
