import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main(args: Array<String>){

    var input: String
    do {
        addTwoNumbers()
        print("\tIf you want to add another two numbers, enter '1',\n\tIf you want to quit, enter '0': ")
        input = readLine().toString()
    } while (input != "0")
    
}

fun addTwoNumbers(){
    println("Here you can add two integers.")
    println("Please enter your numbers below =) ")

    val a: String = GetValue("Number 1")
    val b: String = GetValue("Number 2")

    if(isNumber(a) && isNumber(b) ){
        println("All right, let's see what we got here.")
        println(Executor.addValuesOfString(a.toInt(), b.toInt()) + "\n")
    }
    else{
        println("Ouch, you lied to me! Your entered numbers have been NOT only numbers. Look what we got...")
        println(Executor.addValuesOfString(a, b) + "\n")
    }

}

fun GetValue(string: String) : String {
    print("$string: ")
    return readLine().toString()
}


fun isNumber(string: String) : Boolean{

    try{
        parseInt(string)
    }catch (e: NumberFormatException){
        return false
    }
    return true
}


class Executor {
    companion object{
        fun addValuesOfString(int1: Int, int2: Int) : String {
            val result = int1 + int2
            when(result%2){
                0 -> println("Result is even number")
                1 -> println("Result is odd number")
                -1 -> println("Result is odd number")
            }
            return ("Result: " + result.toString())
        }
    }
}

fun Executor.Companion.addValuesOfString(string1: String, string2: String) : String {
    return ("Result: " + string1 + string2)
}