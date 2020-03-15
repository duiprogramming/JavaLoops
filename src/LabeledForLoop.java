
public class LabeledForLoop {

	public static void main(String[] args) {
		
		loopOne:
		for(int i = 1; i <= 10; i ++){
			
			loopTwo:
			for(int j = 1; j <= 10; j ++){
				
				if(i == 3 && j == 5){
					continue loopOne;
				}
				
				System.out.println("i=" + i + ", j=" + j);
			}
		}
	}

}
