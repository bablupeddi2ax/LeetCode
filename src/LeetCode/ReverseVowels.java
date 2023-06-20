package LeetCode;

public class ReverseVowels {

	public static void main(String[] args) {
		System.out.println(Solution1.reverseVowels("leetcode"));
	}

}

class Solution1 {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        char[] a = s.toCharArray();
        int p = 0;
        int q = a.length - 1;

        while (p < q) {
            if (isVowel(a[p]) && isVowel(a[q])) {
                swap(p, q, a);
                p++;
                q--;
            } else if (!isVowel(a[p])) {
                p++;
            } else if (!isVowel(a[q])) {
                q--;
            }
        }

        return String.valueOf(a);
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static void swap(int i, int j, char[] a) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
