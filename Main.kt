//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Дни недели:")
    for (day in Day.values()) {
        println("${day.name} - ${day.ordinal}")
        day.printDay()
        println("Is weekend: ${day.isWeekend()}")
        println("Is working day: ${day.isWorkingDay()}")
        println("Next day: ${day.nextDay()}")
        println("Previous day: ${day.previousDay()}")
        println()
    }

    println("\nЦвета:")
    for (color in Color.values()) {
        println("${color.name} - ${color.ordinal}")
        color.printColor()
        println("Is warm color: ${color.isWarmColor()}")
        println("Is cool color: ${color.isCoolColor()}")
        println("Mix with Red: ${color.mixColors(Color.RED)}")
        println("Color components: ${color.colorComponents()}")
        println()
    }
}