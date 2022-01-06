fun main(args: Array<String>) {
/*
    println("Who do you want to look up?")
    val name = readln();
*/

    val characterList = CharacterList()

    characterList.printAllNames()
    println("Type a number or name to see information about that character.")
    println("type 'all' to show information about all characters.")
    println("Type 'exit' to quit.")
    val userInput = readln()
    val resultsList = characterList.findCharacter(userInput)
    if (resultsList.isEmpty()) {
        println("No results found.")
    } else {
        resultsList.forEach {
            println(it.printInfo())
        }
    }
}