class CharacterList {
    fun instanciatePeople(): List<Character> {
        val people = listOf(
            Character("Leah", "Cindersap Forest", "Leah's Cottage", listOf("Goat Cheese", "Salad", "Wine")),
            Character("Emily", "Pelican Town", "2 Willow Lane", listOf("Cloth", "Survival Burger", "Wool")),
            Character("Penny", "Pelican Town", "Trailer", listOf("Melon", "Poppy", "Roots Platter")),
        )
        return people
    }

    val allPeople = instanciatePeople()

    fun printAllCharacters() {
        allPeople.map { it.printInfo() }
    }

    fun printAllNames() {
        allPeople.map { println(it.name) }
    }

    fun findCharacter(input: String): List<Character> {
        val result = mutableListOf<Character>()
        for (item in allPeople) {
            if (item.name.equals(input, ignoreCase = true)) {
                result.add(item)
            }
        }
        return result
    }
}
