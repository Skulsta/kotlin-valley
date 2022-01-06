fun main() {
    val characterList = CharacterList()
    val welcomeMessage = "Type part of any name to see information about the characters.\n" +
            "'all' -> information about all characters.\n" +
            "'names' -> all available names.\n" +
            "'exit' -> to quit."
    val seperatorLine = "--------------------------------------------------------------------------------"

    println("Available characters:")
    characterList.printAllNames()
    println(seperatorLine)
    println("Welcome to the Character List Application")
    println(welcomeMessage)
    println(seperatorLine)
    var userInput = ""
    while (userInput != "exit") {
        print("Enter your input: ")
        userInput = readln()
        println(welcomeMessage)
        println(seperatorLine)
            when (userInput) {
                "exit" -> println("Exiting...")
                "all" -> {
                    println("Showing all ${characterList.allPeople.size} characters")
                    characterList.printAllCharacters()
                    println(seperatorLine)
                }
                "names" -> {
                    println("Showing all ${characterList.allPeople.size} available names")
                    characterList.printAllNames()
                    println(seperatorLine)
                }
                else -> {
                    val resultsList = characterList.findCharacter(userInput)
                    if (resultsList.isEmpty()) {
                        println("No results found.")
                    } else {
                        print("\u001b[H\u001b[2J")
                        println("Showing ${resultsList.size} characters:")
                        resultsList.forEach {
                            it.printInfo()
                            println(seperatorLine)
                        }
                    }
                }
            }
    }
}