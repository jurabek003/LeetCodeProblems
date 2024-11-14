import problems.MergeTwoSortedLists.ListNode
import problems.MergeTwoSortedLists.Solution

fun main(args: Array<String>) {
    val solution = Solution()

    val list1= ListNode(1)
    val list2= ListNode(2)

    println(solution.mergeTwoLists(list1, list2))

}