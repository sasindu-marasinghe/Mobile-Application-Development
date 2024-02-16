//ex1
fun main() {
  val moduleName= arrayOf("ITP","MAD","OOP")
    for(i in moduleName){
        println(i)
    }

}
//ex2
fun calculateCircumference(radius: Double): Double {
    val pi = 3.14159 // You can use kotlin.math.PI for a more accurate value of pi
    return 2 * pi * radius
}

fun main1() {
    val radius = 5.0 // Example radius
    val circumference = calculateCircumference(radius)
    println("The circumference of the circle with radius $radius is $circumference")
}

//ex3
 fun calculateGrade(grade:Double){
     when (grade) {
         in 75.0..100.0 -> {
             println("A")
         }
         in 65.0..74.0 -> {
             println("B")
         }
         in 50.0..64.0 -> {
             println("C")
         }
         in 35.0..49.0 -> {
             println("D")
         }
         in 0.0..34.0 -> {
             println("F")
         }
     }
 }
//ex4
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main3() {
    val number = 19 // Example number
    if (isPrime(number)) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}
//ex5
fun createMutableList(){
    var mutableListInt: MutableList<Int> = mutableListOf()
    for(i in 0 .. 100){
        if(i%3 ==0) {
            mutableListInt.add(i)
        }

    }
    for (i in mutableListInt) {
        if(mutableListInt.indexOf(i) % 2 == 0){
            mutableListInt[mutableListInt.indexOf(i)] = 999
        }
    }
    for(i in mutableListInt){
        println(i)
    }
}