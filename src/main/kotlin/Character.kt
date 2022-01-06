class Character(val name: String, val livesIn: String, val address: String, val bestGifts: List<String>) {
    fun printInfo() {
        println("$name lives in $livesIn ($address), and has the following best gifts:")
        for (gift in bestGifts) {
            println("- $gift")
        }
    }
}
