
public class WhileLoop {

	public static void main(String[] args) {

		/*While loop syntax*/
		
		int count = 10;	//Initialize control variable
		
		while(count >= 1){	//Loop condition
			System.out.println(count);
			
			count --;	// Increase or decrease control variable
		}
		
		
		
		/*Infinitely while loop*/
		
		/*while(true){
			System.out.println("*");
		}*/
		
		//In this java class below codes not executing because of above infinit code
		//while(true);
		
		
		//This is not a valid syntax
		//while();
		
		int count2 = 1;
		
		while(count2 <= 10){
			System.out.println(count2);
			
			/*With this decrement count variable value is always less than 10.
			 * So loop is infinite
			 */
			count2 --;	
		}
		
		
		
		//None execute while loop
		
		int count3 = 1;
		
		//This condition is always false and due to that loop not continue
		while(count3 > 10){
			System.out.println(count3);
			count3 ++;
		}
		
	}

}
