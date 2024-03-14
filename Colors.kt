enum class Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;

    fun ColorName() {
        println(name)
    }

    fun WarmColor(): Boolean {
        return this == RED || this == YELLOW || this == ORANGE
    }

    fun ColdColor(): Boolean {
        return !WarmColor()
    }




}