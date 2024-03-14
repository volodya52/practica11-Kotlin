//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Дни недели:")
    for (day in Day.values()) {
        println("${day.name} - ${day.ordinal}")
        day.Print()
        println("Выходные: ${day.Vyhodnoi()}")
        println("Рабочие: ${day.WorkingDay()}")

    }
    println("Цвета:")
    for (color in Color.values()) {
        println("${color.name} - ${color.ordinal}")
        color.ColorName()
        println("Теплые цвета: ${color.WarmColor()}")
        println("Холодные цвета: ${color.ColdColor()}")
    }
}