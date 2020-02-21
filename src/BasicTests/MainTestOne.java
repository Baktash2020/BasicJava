package BasicTests;

public class MainTestOne {

	public static void main(String[] args) {
     
		FunctionsTest FT = new FunctionsTest();
		
		boolean x = FT.compare(1000, 10);
		

		System.out.println(x);
		
		FT.printValue("Michael");
		
		String z= FT.concat("Bob", "Vance");
		
		System.out.println(z);
		

	}

}
