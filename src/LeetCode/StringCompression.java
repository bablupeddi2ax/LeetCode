package LeetCode;
import  java.util.*;
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a','a','a','b','b','b'};
		int d=Solution3.compress(c);
		System.out.println(Solution3.compress(c));
		for(int i = 0;i<d+1;i++) {
			System.out.println(c[i]);
		}
	}

}

class Solution3 {
    public static int compress(char[] chars) {
        Map<Character,Integer> s = new HashMap<>();
        
        for(int i =0;i<chars.length;i++) {
        	if(s.containsKey(chars[i])) {
        		s.put(chars[i], s.get(chars[i])+1);
        	}
        	else {
        		s.put(chars[i], 1);
        	}
        }
        int idx = 0;
        for(char key:s.keySet()) {
        	if(idx<=chars.length-1) {
        	chars[idx] = key;
        	if(s.get(key)!=1) {
        	chars[idx+1] = (char)(s.get(key)+'0');
        	idx+=2;//add the count by converting it into char
        	}
        	
        	
        	}
        	idx++;
        }
        //return length of res array
		return idx+1;
    }
}
