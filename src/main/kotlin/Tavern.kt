fun main() {
    var beverage = readLine()?.let {
        if (it.isNotBlank()){
           it.replaceFirstChar { it.titlecase() }
        } else {"Buttered Ale"}
    }
println(beverage)
}