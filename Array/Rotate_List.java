import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Rotate_List {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length
        ListNode temp = head;
        int length = 1;

        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 2: Make circular
        temp.next = head;

        // Step 3: Reduce k
        k = k % length;

        // Step 4: Find new tail
        int stepsToNewTail = length - k;
        ListNode newTail = temp;

        while (stepsToNewTail-- > 0) {
            newTail = newTail.next;
        }

        // Step 5: Break circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Empty list");
            return;
        }

        // Create linked list
        System.out.println("Enter elements:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        // Rotate
        head = rotateRight(head, k);

        // Print result
        System.out.println("Rotated List:");
        printList(head);

        sc.close();
    }
}