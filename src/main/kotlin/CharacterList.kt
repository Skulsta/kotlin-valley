class CharacterList {
    val seperatorLine = "--------------------------------------------------------------------------------"
    fun instanciatePeople(): List<GameCharacter> {
        val people = listOf(
            GameCharacter("Leah", "Cindersap Forest", "Leah's Cottage", listOf("Goat Cheese", "Salad", "Wine")),
            GameCharacter("Emily", "Pelican Town", "2 Willow Lane", listOf("Cloth", "Survival Burger", "Wool")),
            GameCharacter("Penny", "Pelican Town", "Trailer", listOf("Melon", "Poppy", "Roots Platter")),
            GameCharacter("Sam", "TBA", "TBA", listOf("TBA")),
            GameCharacter("Robin", "TBA", "TBA", listOf("TBA")),
        )
        return people
    }

    val allPeople = instanciatePeople()

    fun printAllCharacters() {
        allPeople.map {
            println(seperatorLine)
            it.printInfo()
        }
    }

    fun printAllNames() {
        allPeople.map { println(it.name) }
    }

    fun findCharacter(input: String): List<GameCharacter> {
        val result = mutableListOf<GameCharacter>()
        for (item in allPeople) {
            if (item.name.contains(input, ignoreCase = true)) {
                result.add(item)
            }
        }
        return result
    }
}
