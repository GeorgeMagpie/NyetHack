fun main(args: Array<String>) {
    val name = "George"
    val healthPoints = 100

    if (healthPoints == 100){
        println("Персонаж $name в отличном состоянии")
    } else if (healthPoints >= 90) {
        println("$name получил пару царапин")
    } else if (healthPoints >= 75) {
        println("$name легко ранен.")
    } else if (healthPoints >= 15) {
        println("$name тяжело ранен.")
}