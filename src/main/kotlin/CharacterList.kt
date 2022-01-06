class CharacterList {
    fun instanciatePeople() : List<Character> {
        val people = listOf(
            Character("Leah", "Cindersap Forest", "Leah's Cottage", listOf("Goat Cheese", "Salad", "Wine")),
            Character("Emily", "Pelican Town", "2 Willow Lane", listOf("Cloth", "Survival Burger", "Wool")),
            Character("Penny", "Pelican Town", "Trailer", listOf("Melon", "Poppy", "Roots Platter")),
            )
        return people
    }

    val allPeople = instanciatePeople()

    fun getAllNames() {
        allPeople.map { it.printInfo() }
    }

    val whatever = getAllNames()



    val randomPeople = listOf(
        {
            val name = "Leah"
            val livesIn = "Cindersap Forest"
            val address = "Leah's Cottage"
            val bestGifts = listOf<String>("Goat Cheese", "Salad", "Wine")
        },
        {
            val name = "Emily"
            val livesIn = "Pelican Town"
            val address = "2 Willow Lane"
            val bestGifts = listOf<String>("Cloth", "Survival Burger", "Wool")
        },
    )
}