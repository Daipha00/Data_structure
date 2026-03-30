//You are given two non-empty linked lists representing two non-negative integers. 
// The digits are stored in reverse order, and each of their nodes contains a single digit. 
// Add the two numbers and return the sum as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.



public class LinkedListNode {
    int data;
    LinkedListNode next;

    // constructor
    LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }

    // method ya kuongeza numbers
    public static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new LinkedListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    // method ya print list
    public static void printList(LinkedListNode node) {
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // l1 = 2 -> 4 -> 3  (342)
        LinkedListNode l1 = new LinkedListNode(2);
        l1.next = new LinkedListNode(4);
        l1.next.next = new LinkedListNode(3);

        // l2 = 5 -> 6 -> 4  (465)
        LinkedListNode l2 = new LinkedListNode(5);
        l2.next = new LinkedListNode(6);
        l2.next.next = new LinkedListNode(4);

        LinkedListNode result = addTwoNumbers(l1, l2);

        printList(result);
    }
}


    

