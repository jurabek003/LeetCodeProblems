package problems.AddTwoNumbers

class Solution {

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        l1?.next=ListNode(1)
        l1?.next=ListNode(2)
        l1?.next=ListNode(3)



        return l1
    }

}