//You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode(2);
        LinkedListNode l2 = new LinkedListNode(4);
        LinkedListNode result = addTwoNumbers(l1, l2);
        System.out.println(result.getData());
    }

    public static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.getData();
            }
            if (l2 != null) {
                sum += l2.getData();
            }
            carry = sum / 10;
            sum = sum % 10;
            current.setNext(new LinkedListNode(sum));
            current = current.getNext();
            l1 = l1 == null ? null : l1.getNext();
            l2 = l2 == null ? null : l2.getNext();
        }
        return dummy.getNext();
    }
    
}
