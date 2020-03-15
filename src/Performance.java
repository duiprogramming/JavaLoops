import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Performance {

	public static void main(String[] args) {
		long startTime;
		long endTime;
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=0; i<100000; i++){
			numbers.add(i);
		}
		
		/*For loop performance*/
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int j=0; j < numbers.size(); j++){
			//Do something
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("For loop execute time :" + (endTime - startTime));
		
		/*For loop second way*/
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int k=numbers.size(); k > 0; k--){
			//
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("For loop second way execute time :" + (endTime - startTime));
		
		/*For each loop*/
		startTime = Calendar.getInstance().getTimeInMillis();
		for(Integer num : numbers){
			//Do something
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("For-each loop execute time :" + (endTime - startTime));
		
		
		/*While loop execution*/
		int index = 0;
		startTime = Calendar.getInstance().getTimeInMillis();
		while(index < numbers.size()){
			//Do something
			index++;
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("While loop execute time :" + (endTime - startTime));
		System.out.println("index="+index);
		
		/*While loop second way execution*/
		int index2 = 0;
		startTime = Calendar.getInstance().getTimeInMillis();
		while(index2++ < numbers.size()){
			//Do something
		}
		endTime = Calendar.getInstance().getTimeInMillis();
		
		System.out.println("While loop execute time :" + (endTime - startTime));
		System.out.println("index2="+index2);
	}

}
