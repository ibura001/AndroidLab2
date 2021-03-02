import java.lang.Integer.parseInt
import java.lang.NumberFormatException

fun main(args: Array<String>){

    var input: String
    do {
        addTwoNumbers()
        print("     If you want to add another two numbers, enter '1',\n     If you want to quit, enter '0': ")
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
        print("Result: ")
        println(addValuesOfString(a.toInt(), b.toInt()) + "\n")
    }
    else{
        println("Ouch, you lied to me! Your entered numbers have been NOT only numbers. Look what we got...")
        print("Result: ")
        println(addValuesOfString(a, b) + "\n")
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

fun addValuesOfString(string1: String, string2: String) : String {
    return (string1+string2)
}

fun addValuesOfString(int1: Int, int2: Int) : String {
    return ((int1 + int2).toString())
}


