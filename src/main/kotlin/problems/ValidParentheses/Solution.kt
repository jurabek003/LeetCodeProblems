package problems.ValidParentheses

import java.util.ArrayDeque

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val pairs = mapOf(
            ')' to '(',
            ']' to '[',
            '}' to '{'
        )
        for ( char in s){
            if (char in pairs.values){
                stack.push(char)
            }else if (char in pairs.keys){
                if (stack.isEmpty() || stack.pop() != pairs[char] ){
                    return false
                }
            }
        }
        return stack.isEmpty()
    }
}