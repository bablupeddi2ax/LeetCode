package LeetCode;

public class AddingTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ListNode l1 = new ListNode(1);
			ListNode l2  = new ListNode(2);
			ListNode l3 = new ListNode(3);
			ListNode l4  = new ListNode(4);
			ListNode l5 = new ListNode(5);
			ListNode l6  = new ListNode(6);
			
			ListNode m1 = new ListNode(1);
			ListNode m2  = new ListNode(2);
			ListNode m3 = new ListNode(3);
			ListNode m4  = new ListNode(4);
			ListNode m5 = new ListNode(5);
			ListNode m6  = new ListNode(6);
//			123456
//			123456
//			2468013
			l1.next = l2;
			l2.next  =l3;
			l3.next = l4;
			l4.next = l5;
			l5.next = l6;
			l6.next = null;
			
			m1.next = m2;
			m2.next  =m3;
			m3.next = m4;
			m4.next = m5;
			m5.next = m6;
			m6.next = null;
			ListNode t1,t2;
			t1 = l1;
			t2 = m1;
			while(t1!=null || t2!=null) {
				int carry=0;
				if(t1.val + t2.val>=10) { 
					if(carry==0) {
					t1.val= (t1.val+t2.val)%10 + carry;
					
					carry = (t1.val + t2.val)/10;
					}
				}else {
					t1.val= (t1.val+t2.val)%10 ;
					carry = (t1.val + t2.val)/10;
				}
				t1.val = t1.val + t2.val;
				if(t1.next==null || t2.next==null) {
					break;
				}
				if(t1.next!=null )
				t1  = t1.next;
				if(t2.next!=null)
				t2 = t2.next;
			}
			print(l1);
			System.out.println();
			
					
			
			
			
	}
	
	static void print(ListNode h) {
		while(h!=null) {
			System.out.print(h.val + " ");
			h = h.next;
		}
	}
}
