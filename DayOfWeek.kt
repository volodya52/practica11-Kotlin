enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    fun Print() {
        println(this.name)
    }

    fun Vyhodnoi(): Boolean {
        return this == SATURDAY || this == SUNDAY
    }

    fun WorkingDay(): Boolean {
        return !Vyhodnoi()
    }




}
