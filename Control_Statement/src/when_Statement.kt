

fun main(args : Array<String>)
{
    var a =11

    when(a){

        1 -> println("a is 1")
        2 ->  {
                println("a is 2")
                println("We also write multiple statements in code blocks")
              }
        3,4 -> println("a 3 is  OR 4") //we also write multiple conditions.

        in 11..20 -> println("a is lies between 11 to 20") //we also use RANGES with 'in' OPERATOR.

        else -> println("unknown number")  //default statement
    }


    //----------------------------------
    //when as Expression

    var x = 22
    var str : String = when(x) {
        1 -> "a is 1"
        2 -> "a is 2"
        else -> "x is unknown"
    }
    println("str is : $str")
}