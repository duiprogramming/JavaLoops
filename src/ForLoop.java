
public class ForLoop {

	public static void main(String[] args) {
		
		//Initialize increment variable
		//Check the loop condition
		//Increment or decrement control variable
		for(int count = 1; count < 10; count ++){
			System.out.println(count);
		}
		
		System.out.println();
		
		//Same as previous code
		int count1;
		for(count1 = 1; count1 < 10; count1 ++){
			System.out.println(count1);
		}
		
		System.out.println();
		
		//This is also same as above
		int count2 = 1;
		for(;count2 < 10; count2 ++){
			System.out.println(count2);
		}
		
		//Infinite for loop
		for(;;){
			System.out.println("*");
		}
	}

}
