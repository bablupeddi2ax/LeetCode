package LeetCode;
import java.util.*;
public class NCR {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> l =  new ArrayList<>();
		ArrayList<Integer> t;
		// TODO Auto-generated method stub
		for(int i = 0;i<30;i++) {
			 t = new ArrayList<>();
			for(int j= 0;j<=i;j++) {
				t.add(C(i,j));
			}
			l.add(t);
			System.out.println();
		}
		for(ArrayList<Integer> a:l) {
			System.out.println(a);
		}
	}
	static int C(int n,int r) {
		if(n==r || r==0) {
			return 1;
		}
		return C(n-1,r-1)   + C(n-1,r);
	}

}
