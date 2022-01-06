class Search(val input: String, val list: List<Character>) {

    fun find(): List<Character> {
        val result = mutableListOf<Character>()
        for (item in list) {
            if (item.name.contains(input)) {
                result.add(item)
            }
        }
        return result
    }
}