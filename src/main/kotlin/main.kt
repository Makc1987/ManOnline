fun main() {
    println("Введите насколько давно был собеседник в секундах: ")
    val time = readln().toInt()
    agoToText(time)
}
fun agoToText(time: Int) {
    when(time) {
        in 0 .. 60 -> println("был(а) только что")
        in 61 .. 60 * 60 -> {
            val minutes = time / 60
            val minText = agoMinutes(minutes)
            println("был(а) $minutes $minText")}
        in 60*60+1 .. 24*60*60 -> {
            val hours = time / 3600
            val hoursText = agoHours(hours)
            println("был(а) $hours $hoursText")}
        in 24*60*60 .. 48*60*60 -> println("был(а) вчера")
        in 48*60*60 .. 72*60*60 -> println("был(а) позавчера")
        else -> println("был(а) давно")
    }
}
fun agoMinutes(minutes: Int): String {
    val lastNumber = minutes % 10
    if (minutes in 11..14) return "минут назад"
    when(lastNumber) {
        1 -> return "минуту назад"
        in 2..4 -> return "минуты назад"
        in 5..9 -> return "минут назад"
    }
    return ""
}
fun agoHours (hours: Int): String {
    val lastNumber = hours % 10
    if (hours in 5..20) return "часов назад"
    when (lastNumber) {
    1 -> return "час назад"
    in 2..4 -> return "часа назад"
    }
    return ""
}