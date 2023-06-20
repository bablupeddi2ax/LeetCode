package LeetCode;

public class Ree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,3,2,4};
		for(int i = 1;i<=30;i++) {
			for(int j =0;j<a.length;j++) {
			System.out.print("#" + (int)((int)i*10  + (int)a[j]) +"# ");
			}
		}
	}
}
