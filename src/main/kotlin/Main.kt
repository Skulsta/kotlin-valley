fun main(args: Array<String>) {
    val characterList = CharacterList()

    characterList.printAllNames()
    println("Type a number or name to see information about that character.")
    println("type 'all' to show information about all characters.")
    println("Type 'exit' to quit.")
    var userInput = ""
    while (userInput != "exit") {
        userInput = readln()
        if (userInput === "all") {
            characterList.printAllNames()
        } else {
            when (userInput) {
                "exit" -> println("Exiting...")
                "all" -> characterList.printAllCharacters()
                else -> {
                    val resultsList = characterList.findCharacter(userInput)
                    if (resultsList.isEmpty()) {
                        println("No results found.")
                    } else {
                        resultsList.forEach {
                            println(it.printInfo())
                        }
                    }
            }
            }
        println("Type part of any names to see information about the matching characters.")
        println("type 'all' to show information about all characters.")
        println("Type 'exit' to quit.")
      }
    }
}