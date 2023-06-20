package LeetCode;
import java.util.*;
public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,2,3,3,3,3};
		System.out.println(
		Solution.removeDuplicates(nums));
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(
			nums[i]);		}
	}

}
class Solution {
    public static  int removeDuplicates(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int lastDup = nums[0];
        int[] arr = new int[nums.length];
        int idx = 0;
      
        	for(int i  =0;i<nums.length;i++) {
    			if(i<nums.length-1 && nums[i]==nums[i+1] && lastDup!=nums[i]) {
    				continue;
    			}
    			else {
    				//System.out.println(nums[i]);
    				a.add(nums[i]);
    				i++;
    			}
    		}

        for(int i = 0;i<a.size();i++){
            nums[idx] = arr[idx];
           // System.out.println(nums[idx]);
        }
        for(int i = a.size();i<nums.length;i++){
            nums[i] = 0;
        }
        return a.size();
    }
}