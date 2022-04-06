fun main(args: Array<String>) {
    for (year in 1900..1999) {
        for (month in 1..12) {
            when (month) {
                9, 4, 11, 6 -> MagicYear(30, month, year)
                2 -> if (year / 4 == 0) {
                    MagicYear(28, month, year)
                } else {
                    MagicYear(29, month, year)
                }
                else -> MagicYear(31, month, year)
            }
        }
    }

}

fun MagicYear(day: Int, month: Int, year: Int) {
    val shotYear = year % 100
    for (i in 1..day) {
        if (i * month == shotYear) {
            println("$i.$month.$year")
        }
    }
}