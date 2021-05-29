package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val subStrings = arrayListOf<String>()
        var count = 0
        var indexStart = 0
        for (i in inputString.indices) {
            when (inputString[i]) {
                '<' -> {
                    indexStart = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '<') {
                            count++
                        }
                        if (inputString[j] == '>') {
                            count--
                            if (count == 0) {
                                subStrings.add(inputString.substring(indexStart until j))
                                break
                            }
                        }
                    }
                }
                '[' -> {
                    indexStart = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '[') {
                            count++
                        }
                        if (inputString[j] == ']') {
                            count--
                            if (count == 0) {
                                subStrings.add(inputString.substring(indexStart until j))
                                break
                            }
                        }
                    }
                }
                '(' -> {
                    indexStart = i + 1
                    for (j in i..inputString.lastIndex) {
                        if (inputString[j] == '(') {
                            count++
                        }
                        if (inputString[j] == ')') {
                            count--
                            if (count == 0) {
                                subStrings.add(inputString.substring(indexStart until j))
                                break
                            }
                        }
                    }
                }
            }
        }
        return subStrings.toTypedArray()
    }
}

