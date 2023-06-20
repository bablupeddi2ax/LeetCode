package LeetCode;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		//1,2,3,4.5,6
		System.out.println(Sol.findKthLargest(nums, 4));
	}

}
class Sol {
    public static  int findKthLargest(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                m.put(nums[i],m.get(nums[i])+1);
            }
            else{
                m.put(nums[i],1);
            }
        }
        int maxK = Integer.MIN_VALUE;
        int idx  = 0;
        int[] aol= new int[m.size()];
        for(int i:m.keySet()){
            aol[idx] = i;
            idx++;
        }
        for(int i:nums) {
        	System.out.println(i);
        }
        return aol[idx-k];
    }
}