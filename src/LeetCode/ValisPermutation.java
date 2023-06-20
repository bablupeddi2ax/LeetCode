package LeetCode;

public class ValisPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solutions.isPalindrome("A man, a plan, a canal: Panama");
	}

}

class Solutions {
    public static  boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(Character.isLetter(ch[i])){
                sb.append(ch[i]);
                sb.setCharAt(sb.inde), 0);
                Integer.val
            }
        }
        return isPalindrome(sb.toString());
    }
   public static  boolean isPalindrom(String a){
        StringBuilder sb = new StringBuilder();
        StringBuilder s = new StringBuilder();
        s = sb;
        for(int i = a.length()-1;i>=0;i--){
            sb.append(a.charAt(i));
        }
        if(sb.toString().equals(a))
        {
        	
            return true;
            sb.sub
        }
        return false;
    }

}