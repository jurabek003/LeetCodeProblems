package problems.LongestCommonPrefix

class Solution {

    fun longestCommonPrefix(strs: Array<String>): String {

        // bu usul itemni harflarini joyiga qarap topadi
        var current = strs[0]
        for (i in 0..strs.size-2) {
            current = current.commonPrefixWith(strs[i+1])
        }



        /** Bu usul arrayni ichidagi itemnilarni joyiga qaramasdan bor hammasida bor hariflarni topadi :)
        for ( i in value.indices){
            for ( j in strs.indices){
                if (strs[j].contains(value[i])){
                    number++
                }else{
                    number=0
                }
            }
            if (number == strs.size){
                sum+=value[i]
                number=0
            }
        }
         **/

        return current

    }
}



//        for (i in 1..<strs.size) {
//            val item = strs[i]
//            for (j in item.indices) {
//                isGot += if (value.contains(item[j])) {
//                    item[j]
//                } else {
//                    ""
//                }
//            }
//        }
//
//        for (i in isGot.indices) {
//            for (j in strs.indices) {
//                if (strs[j].contains(isGot[i]))
//                    number++
//                else
//                    number = 0
//
//                if (number == strs.size) {
//                    sum += isGot[i]
//                    number = 0
//                }
//            }
//        }