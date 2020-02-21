package BasicTests;

import java.util.Scanner;

public class FirstTests {

	public static void main(String[] args) {

          int basePrice;
          int warrentyPrice;
          int dealerfee;
          
          Scanner input= new Scanner(System.in);
          
          System.out.println("Enter Base Price for the car");
          
          basePrice=input.nextInt();
          
          System.out.println("Enter warrenty for the car");
          warrentyPrice= input.nextInt();
          System.out.println("Enter dealer fee for the car");
          dealerfee=input.nextInt();
          
          
          int finalPrice;
          finalPrice = basePrice+warrentyPrice+dealerfee;
          
          System.out.println("This is the final price of the car");
          System.out.println(finalPrice);
          
          
		
		
		
		

	}

}
