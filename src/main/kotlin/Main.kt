import problems.LongestCommonPrefix.Solution


fun main(args: Array<String>) {

    val solution = Solution()

    val array : Array<String> = arrayOf(
        "salom",
        "qalesan",
        "jurabek"
    )

    println(solution.longestCommonPrefix(array))

}