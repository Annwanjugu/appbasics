fun main(){
    var f:Int =6
    var u:Int = 6
    var c:Int = 67

    var maximum:Int = maxOf(f,c,u)
    println("The greatest number is $maximum")



    if (f>u && f>c) {
        println("The greatest number is $f")
    }else if (u>f && u>c){
        println("The greatest number is $u")
    }else{
       println("The greatest number is $c")
    }
































}