package problems.PalindromNumber

class Solution {
    fun isPalindrome(x:Int):Boolean{
        val xString=x.toString()
        var yString=""
        for (i in xString.length-1 downTo 0){
            yString+=xString[i]
        }

        return xString==yString
    }

}