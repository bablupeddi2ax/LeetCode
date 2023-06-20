package LeetCode;
import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m = new HashMap<>();
		int[] a = {2,7,11,15};
		int target = 9;
		//Two Sum
	
		for(int i = 0;i<a.length;i++) {
			if(m.containsKey(a[i])) {
				m.put(a[i], m.get(a[i])+1);
			}
			else {
				m.put(a[i],1);
			}
		}
		m.get
		for(int i = 0;i<a.length;i++) {
			if(m.containsKey(target-a[i])) {
				System.out.println("Yes is posssible the value are " + (target-a[i]) + " " +a[i] );
				break;
			}
		}
		
	}

}
