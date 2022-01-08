class CharacterList {
    val seperatorLine = "--------------------------------------------------------------------------------"
    fun instanciatePeople(): List<GameCharacter> {
        val people = listOf(
            GameCharacter("Leah", "Cindersap Forest", "Leah's Cottage", listOf("Goat Cheese", "Salad", "Wine")),
            GameCharacter("Emily", "Pelican Town", "2 Willow Lane", listOf("Cloth", "Survival Burger", "Wool")),
            GameCharacter("Penny", "Pelican Town", "Trailer", listOf("Melon", "Poppy", "Roots Platter")),
            GameCharacter("Sam", "Pelican Town", "1 Willow Lane", listOf("Pizza", "Cactus Fruit")),
            GameCharacter("Robin", "The Mountain", "24 Mountain Road", listOf("Goat cheese", "Peach", "Spaghetti")),
            GameCharacter("Alex", "Pelican Town", "1 River Road", listOf("Complete Breakfast")),
            GameCharacter("Elliot", "The Bearch", "Elliott's Cabin", listOf("Duck Feather", "Squid Ink", "Pomegranate")),
            GameCharacter("Harvey", "Pelican Town", "Medical Clinic", listOf("Coffee", "Pickles", "Wine")),
            GameCharacter("Sebastian", "The Mountain", "24 Mountain Road", listOf("Pumpkin soup", "Frozen tear", "Sashimi")),
            GameCharacter("Shane", "Cindersap Forest", "Marnie's Ranch", listOf("Beer", "Hot pepper", "Pizza")),
            GameCharacter("Abigail", "Pelican Town", "Pierre's General Store", listOf("Amethyst", "Pufferfish", "Pumpkin")),
            GameCharacter("Haley", "Pelican Town", "2 Willow Lane", listOf("Coconut", "Fruit salad", "Sunflower")),
            GameCharacter("Maru", "The Mountain", "24 Mountain Road", listOf("Cauliflower", "Strawberry", "Miner's Treat")),
            GameCharacter("Caroline", "Pelican Town", "Pierre's General Store", listOf("Fish taco", "Green tea", "Tropical Curry")),
            GameCharacter("Clint", "Pelican Town", "Blacksmith", listOf("Amathyst", "Topaz", "Fiddlehead Risotto", "Jade")),
            GameCharacter("Demetrius", "The Mountain", "24 Mountain Road", listOf("Bean hotpot", "Strawberry", "Rice pudding")),
            GameCharacter("Dwarf", "The Mines", "Eastern Cave", listOf("Amethyst", "Jade", "Topaz")),
            GameCharacter("Evelyn", "Pelican Town", "1 River Road", listOf("Beet", "Fairly Rose", "Tulip", "Stuffing")),
            GameCharacter("George", "Pelican Town", "1 River Road", listOf("Fried Mushroom", "Leek")),
            GameCharacter("Gus", "Pelican Town", "The Stardrop Saloon", listOf("Fish Taco", "Orange", "Tropical Curry")),
            GameCharacter("Jas", "Cindsap Forest", "Marnie's Ranch", listOf("Fairy Rose", "Plum Pudding")),
            GameCharacter("Jodi", "Pelican Town", "1 Willow Lane", listOf("Fried Eel", "Pancakes", "Eggplant Parmesan")),
            GameCharacter("Kent", "Pelican Town", "1 Willow Lane", listOf("Fiddlehead Risotto", "Roasted Hazelnuts")),
            GameCharacter("Krobus", "The Sewers", "Krobus's Shop", listOf("Pumpkin", "Void Mayonnaise", "Wild Horseradish")),
            GameCharacter("Leo", "Ginger Island", "Hut/Treehouse", listOf("Duck Feather", "Mango", "Ostrich Egg")),
            GameCharacter("Lewis", "Pelican Town", "Mayor's Manor", listOf("Green Tea", "Hot Pepper", "Vegetable Medley")),
            GameCharacter("Linus", "The Mountain", "Tent", listOf("Cactus Fruit", "Coconut", "Dish O' The Sea", "Yam")),
            GameCharacter("Marnie", "Cindersap Forest", "Marnie's Ranch", listOf("Farmer's Lunch", "Pumpkin Pie")),
            GameCharacter("Pam", "Pelican Town", "Trailer", listOf("Beer", "Cactus Fruit", "Mead", "Parsnip", "Pale Ale")),
            GameCharacter("Pierre", "Pelican Town", "Pierre's General Store", listOf("Fried Calamari")),
            GameCharacter("Sandy", "The Desert", "Oasis", listOf("Crocus", "Daffodil", "Sweet Pea")),
            GameCharacter("Vincent", "Pelican Town", "1 Willow Lane", listOf("Grape", "Snail", "Ginger Ale")),
            GameCharacter("Willy", "The Beach", "Fish Store", listOf("Catfish", "Mead", "Pumpkin", "Sturgeon", "Octopus")),
            GameCharacter("Wizard", "Cindersap Forest", "Wizard's Tower", listOf("Purple Mushroom", "Solar Essence", "Void Essence", "Super Cucumber")),
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
