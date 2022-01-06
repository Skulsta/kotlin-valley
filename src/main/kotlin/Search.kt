class Search(val input: String) {
    fun find(pattern: String): Int {
        var i = 0
        var j = 0
        while (i < input.length && j < pattern.length) {
            if (input[i] == pattern[j]) {
                i++
                j++
            } else {
                i = i - j + 1
                j = 0
            }
        }
        if (j == pattern.length) {
            return i - j
        }
        return -1
    }
}