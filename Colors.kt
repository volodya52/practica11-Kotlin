enum class Color {
    RED, GREEN, BLUE, YELLOW, ORANGE;

    fun printColor() {
        println(this.name)
    }

    fun isWarmColor(): Boolean {
        return this == RED || this == YELLOW || this == ORANGE
    }

    fun isCoolColor(): Boolean {
        return !isWarmColor()
    }

    fun mixColors(otherColor: Color): String {
        return when {
            (this == RED && otherColor == BLUE) || (this == BLUE && otherColor == RED) -> "Purple"
            (this == RED && otherColor == YELLOW) || (this == YELLOW && otherColor == RED) -> "Orange"
            (this == BLUE && otherColor == YELLOW) || (this == YELLOW && otherColor == BLUE) -> "Green"
            else -> "Unknown"
        }
    }

    fun colorComponents(): List<String> {
        return when (this) {
            RED -> listOf("Red", "Green", "Blue")
            GREEN -> listOf("0", "255", "0")
            BLUE -> listOf("0", "0", "255")
            YELLOW -> listOf("255", "255", "0")
            ORANGE -> listOf("255", "165", "0")
        }
    }
}