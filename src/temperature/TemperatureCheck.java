package temperature;

import java.util.Scanner;

public class TemperatureCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the value of Temperature:\n");
		int temp = scan.nextInt();
		if (temp > 100){
			System.out.println("water is not boining");	
		}
		else if (temp <= 100) {
			System.out.println("water is about to boil");
		}
		else{
			System.out.println("water is not boiling");
		}
			
		}
				
		

	}


