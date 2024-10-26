import problems.LongestCommonPrefix.Solution


fun main(args: Array<String>) {

    val solution = Solution()

    val array : Array<String> = arrayOf(
        "shukurillo",
        "sharabek",
        "shukurillo",
//        "yusuf"
    )

    println(solution.longestCommonPrefix(array))

}