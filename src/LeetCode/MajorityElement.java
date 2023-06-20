package LeetCode;
import java.util.*;
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,3};
System.out.println(S.majorityElement(nums));
	}

}

class S {
    public static  int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }
            else {
            	m.put(nums[i], 1);
            }
        }

        int maxFreq = 0;
        for(int key:m.keySet()){
            if(m.get(key)>(nums.length/2)){
                maxFreq = key;
                break;
            }
        }
        return maxFreq;

    }
}