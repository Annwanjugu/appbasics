fun main(){
    numbers()
    measure()


    val num1 = 12
    val num2 = 18
    val lcm =findLCM(num1,num2)
    println("LCM of $num1 and $num2 is $lcm")
var Ann = readln()
    println(Ann)

}





fun numbers(){
    var one = 6
    var two = 7
    var three = 9

    var maximum:Int = maxOf(one, two, three)
    println("Maximum: $maximum")

    var minimum:Int = minOf(one, two, three)
    println("Minimum: $minimum")
}

fun measure(){
    var Temperature = 35

    var change:Int = (Temperature*9/5)+32
    println("Fahrenheit: $change")

}

fun findLCM(num1: Int,num2: Int): Int{
    return (num1*num2)/findGCD(num1,num2)
}
fun findGCD(a: Int,b: Int):
        Int {
    var num1 = a
    var num2 = b
    while (num2 != 0) {
        val temp = num2
        num2 = num1 % num2
        num1 = temp
    }
    return num1
}

