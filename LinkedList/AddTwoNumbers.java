import java.math.BigInteger;

public class AddTwoNumbers {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            StringBuilder num1 = new StringBuilder();
            StringBuilder num2 = new StringBuilder();

            while (l1 != null || l2 != null) {
                if (l1 != null) {
                    num1.append(l1.val);
                    l1 = l1.next;
                }
                if (l2 != null) {
                    num2.append(l2.val);
                    l2 = l2.next;
                }
            }

            BigInteger n1 = num1.length() > 0 ? new BigInteger(num1.reverse().toString()) : BigInteger.ZERO;
            BigInteger n2 = num2.length() > 0 ? new BigInteger(num2.reverse().toString()) : BigInteger.ZERO;

            BigInteger sum = n1.add(n2);
            String sumStr = new StringBuilder(sum.toString()).reverse().toString();

            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            for (char c : sumStr.toCharArray()) {
                current.next = new ListNode(Character.getNumericValue(c));
                current = current.next;
            }

            return dummy.next;
        }


}
