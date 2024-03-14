enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    fun printDay() {
        println(this.name)
    }

    fun isWeekend(): Boolean {
        return this == SATURDAY || this == SUNDAY
    }

    fun isWorkingDay(): Boolean {
        return !isWeekend()
    }

    fun nextDay(): Day {
        val values = Day.values()
        val nextOrdinal = (this.ordinal + 1) % values.size
        return values[nextOrdinal]
    }

    fun previousDay(): Day {
        val values = Day.values()
        val previousOrdinal = if (this.ordinal - 1 < 0) values.size - 1 else this.ordinal - 1
        return values[previousOrdinal]
    }
}
