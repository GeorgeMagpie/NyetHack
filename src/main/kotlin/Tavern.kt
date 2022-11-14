fun main() {
    var beverage = readLine()

    if (beverage == null || beverage == "") {
        println("I can't do that without crashing - beverage was null!")
    } else {
        beverage = beverage.replaceFirstChar { it.titlecase() }
        println(beverage)
    }


}