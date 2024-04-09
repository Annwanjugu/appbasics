import java.time.LocalDate
import java.time.LocalTime
import java.time.DayOfWeek
import java.time.Month

fun main(){
    axel()
    time()
}
fun axel() {
    val current: LocalDate = LocalDate.now()
    println(current)
        val present: LocalTime = LocalTime.now()
        println(present)
}
fun time(){
    var clock = LocalTime.now()
    var date = LocalDate.now()
    var day = date.dayOfWeek
    var month = date.month

    println(day)
    println(month)


}


