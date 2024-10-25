package problems.RomanToIntager

class Solution {
    // Rim raqamini tekshiradigan funksiya
    fun isValidRoman(s: String): Boolean {
        val validRomanPattern = "^M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$".toRegex()
        return validRomanPattern.matches(s)
    }

    fun romanToInt(s: String): Int {

        if (!isValidRoman(s)) {
            throw IllegalArgumentException("Noto'g'ri Rim raqami: $s")
        }

        var prevNumber = 0
        var sum = 0
        val romanMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        for ( i in s.reversed()){
            val currentValue = romanMap[i] ?: 0
            if (currentValue < prevNumber ){
                sum -= currentValue
            }else{
                sum += currentValue
            }
            prevNumber = currentValue
        }

        return sum
    }
}