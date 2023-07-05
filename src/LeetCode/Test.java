package LeetCode;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		//1,2,3,4.5,6
		//System.out.println(Sol.findKthLargest(nums, 4));
		int start = 0;
		int end = 0;
		int[] arr = {1,2,3,0,1,2,3,0};
//		for(int i = 0;i<arr.length;i++) {
//			if(arr[i]==0 && arr[i+1]!=0) {
//				start=i;
//				int k = i;
//				while(arr[k]>0) {
//					k++;
//				}
//				end = k;
//				
//			}
//		}
		StringBuilder sb= new StringBuilder("101010");
		Stack<Character> s = new Stack<>();
		s.push('h');
	s.pe
		System.out.println(s.contains('h'));
		System.out.println(Math.pow(2, 500));
		double i;
		for(int j = 0;j<arr.length-1;j++) {
			i = (Math.random()-0.5);
		if(i>0) {
			arr[j] = arr[j]^arr[j+1];
			arr[j+1] = arr[j]^arr[j+1];
			arr[j] = arr[j]^arr[j+1];
		}
		}
		for(int j = 0;j<arr.length-1;j++) {
		System.out.println(arr[j]);
		}
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