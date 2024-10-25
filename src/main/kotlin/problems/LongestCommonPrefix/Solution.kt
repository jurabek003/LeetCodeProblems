package problems.LongestCommonPrefix

class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {

        val sum = ""
        var value: String = strs[0]
        var isGot = ""


        for (i in 1..<strs.size) {
            for (j in 0..<i.toString().length) {
                isGot += if (value.contains(i.toString()[j])) {
                    i.toString()[j].toString()
                } else {
                    println(false)
                    ""
                }

            }
        }

        return isGot
    }
}