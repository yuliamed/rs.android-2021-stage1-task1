package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size <= 2) {
            return sadArray
        }
        var happyArray = sadArray.toMutableList()
        var work = true;
        while (work) {
            var innerWork = false
            for (i in 1 until happyArray.lastIndex) {
                if (happyArray[i] > happyArray[i - 1] + happyArray[i + 1]) {
                    happyArray.removeAt(i)
                    innerWork = true
                    break
                }
            }
            if (!innerWork) break
        }
        return happyArray.toIntArray()
    }
}
