package LeetCode;
import java.util.*;
public class AlternativeStringsAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "Apple";
		String s2 = "Ball";
		StringBuilder sb = new StringBuilder();
		int p  = 0;
		int q = 0;
		int n= s1.length() + s2.length();
		for(int i = 0;i<n;i++) {
			if(i%2==0) {
				sb.append(s1.charAt(p));
				p = p+1;
			}
			else if(i%2!=0) {
				sb.append(s2.charAt(q));
				q = q+1;
			}
		}
		System.out.println(sb.toString());
	}

}
