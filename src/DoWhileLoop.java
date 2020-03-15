
public class DoWhileLoop {

	public static void main(String[] args) {
		
		int count = 1;	//Initialize increment variable
		
		do{
			System.out.println(count);
			count ++;
		}while(count <= 1);
		
		/*Do while loop execute at least one time 
		because it check loop contion after execute do{} block first time
		*/
		
		
		
		/*Infinite loop working as while loop*/
		
		
		do{
			System.out.println("*");
			
		}while(false);
		
		/*do while loop execute at least one time*/
	}

}
