package leetcode.p2;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
//    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
//        return addHelper(l1, l2, 0);
//    }
//
//    public ListNode addHelper(ListNode l1, ListNode l2, int carry) {
//        if (l1 == null && l2 == null) {
//            if (carry == 1) {
//                return new ListNode(1);
//            } else {
//                return null;
//            }
//        }
//        if (l1 == null) {
//            if (carry == 1) {
//                if (l2.val == 9) {
//                    l2.val = 0;
//                    l2.next = addHelper(null, l2.next, 1);
//                } else {
//                    l2.val++;
//                }
//            }
//            return l2;
//        }
//        if (l2 == null) {
//            return addHelper(null, l1, carry);
//        }
//        if (l1.val + l2.val + carry > 9) {
//            l1.val += l2.val + carry - 10;
//            l1.next = addHelper(l1.next, l2.next, 1);
//        } else {
//            l1.val += l2.val + carry;
//            l1.next = addHelper(l1.next, l2.next, 0);
//        }
//        return l1;
//    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if (l1 == null) {
//            return l2;
//        }
//        if (l2 == null) {
//            return l1;
//        }
//        ListNode result = new ListNode();
//        ListNode ptr = result;
//        int carry = 0;
//        while (l1 != null && l2 != null) {
//            ptr.next = new ListNode(l1.val + l2.val + carry);
//            ptr = ptr.next;
//            if (ptr.val > 9) {
//                ptr.val -= 10;
//                carry = 1;
//            } else {
//                carry = 0;
//            }
//            l1 = l1.next;
//            l2 = l2.next;
//        }
//        ListNode temp;
//        if (l1 != null) {
//            temp = l1;
//        } else if (l2 != null) {
//            temp = l2;
//        } else {
//            temp = null;
//        }
//        ptr.next = temp;
//        if (carry == 1) {
//            if (temp == null) {
//                ptr.next = new ListNode(1);
//            } else {
//                while (temp.next != null && temp.val + carry == 10) {
//                    temp.val = 0;
//                    temp = temp.next;
//                }
//                temp.val+=carry;
//                if (temp.next == null && temp.val == 10) {
//                    temp.val = 0;
//                    temp.next = new ListNode(1);
//                }
//            }
//        }
//        return result.next;
//    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode ptr = result;
        int carry = 0;
        int v1, v2;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                v1 = 0;
            } else {
                v1 = l1.val;
            }
            if (l2 == null) {
                v2 = 0;
            } else {
                v2 = l2.val;
            }
            int val = v1 + v2 + carry;
            carry = val / 10;
            ptr.next = new ListNode(val % 10);
            ptr = ptr.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry == 1) {
            ptr.next = new ListNode(1);
        }
        return result.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers a = new AddTwoNumbers();
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(1);
        ListNode l2 = new ListNode(1);
        a.addTwoNumbers(l1, l2);
    }
}


